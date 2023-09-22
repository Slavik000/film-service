package com.stepanenko.filmmicroservice.conrollers;

import com.stepanenko.filmmicroservice.models.Film;
import com.stepanenko.filmmicroservice.repository.FilmsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



import java.util.List;

@AllArgsConstructor
@Service
public class FilmService {

    private final FilmsRepository filmRepository;


    public List<Film> getFilmListService(){
        return filmRepository.findAll();
    }
    /*public Film getFilmInfo(String public_film_id){
        return filmRepository.findFilmByPublic_film_id(public_film_id);
    }*/
}
