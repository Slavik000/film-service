package com.stepanenko.filmmicroservice;

import com.stepanenko.filmmicroservice.models.Film;
import com.stepanenko.filmmicroservice.repository.FilmsRepository;
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


	@Bean
	CommandLineRunner runner(FilmsRepository repository,
							 MongoTemplate mongoTemplate  ){
		return args ->{

			Film student = new Film("596857","olga");

			Query query = new Query();
			query.addCriteria(Criteria.where("public_film_id").is("596857"));

			List<Film> films = mongoTemplate.find(query, Film.class);

			if(films.size()>1){
				throw new IllegalStateException("exist");
			}

			if(films.isEmpty()){
				repository.insert(student);
			}else{
				System.out.println("already using this email!");
			}

		};
	}

}
