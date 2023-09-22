package com.stepanenko.filmmicroservice.repository;

import com.stepanenko.filmmicroservice.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FilmsRepository extends MongoRepository<Film,String> {
    /*Film findFilmByPublic_film_id(String public_film_id);*/
}
