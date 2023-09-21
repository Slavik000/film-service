package com.stepanenko.filmmicroservice.conrollers;

import com.stepanenko.filmmicroservice.models.Film;
import com.stepanenko.filmmicroservice.models.FilmsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.List;

@AllArgsConstructor
@Service
public class FilmService {

    private final FilmsRepository filmRepository;



    public List<Film> getFilmListService(){
        return filmRepository.findAll();
    }
}
