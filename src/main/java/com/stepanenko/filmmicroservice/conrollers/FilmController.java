package com.stepanenko.filmmicroservice.conrollers;

import com.stepanenko.filmmicroservice.models.Film;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/films")
@AllArgsConstructor  //замінює конструктор
public class FilmController {

    private final FilmService filmService;

    @GetMapping()
    public List<Film> getFilmList(){
        return filmService.getFilmListService();

    }
}
