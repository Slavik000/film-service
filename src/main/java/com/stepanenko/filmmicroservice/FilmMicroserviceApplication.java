package com.stepanenko.filmmicroservice;

import com.stepanenko.filmmicroservice.models.Film;
import com.stepanenko.filmmicroservice.models.FilmsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;


@SpringBootApplication
public class FilmMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmMicroserviceApplication.class, args);
	}
//додаємо монготаплейт
	//як створюється repository?
	@Bean
	CommandLineRunner runner(FilmsRepository filmRepository, MongoTemplate mongoTamplate){
		return args -> {
			Film film = new Film("1654198","film first", 100);
			Query query=new Query();
			query.addCriteria(Criteria.where("public_film_id").is("1654198" ));

			List<Film> filmList = mongoTamplate.find(query, Film.class); //не виводить адекватний результат! :(


			if(filmList.size()>1){
				throw new IllegalStateException(
						"ID already used!"
				);
			}
			System.out.println("test");

			if(filmList.isEmpty()){

				filmRepository.insert(film);
				System.out.println("Your profile created!");
			}else{
				System.out.println("Your email already using!");
			}

		};
	}

}
