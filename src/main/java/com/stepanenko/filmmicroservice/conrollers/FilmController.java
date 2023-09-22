package com.stepanenko.filmmicroservice.conrollers;

import com.stepanenko.filmmicroservice.models.Film;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/films")
@AllArgsConstructor  //замінює конструктор
public class FilmController {

    private final FilmService filmService;

    @GetMapping()
    public String getFilmList(Model model){
        model.addAttribute("allFilms",filmService.getFilmListService());
        return "films/allFilms";

    }
    /*@GetMapping()
    public List<Film> getFilmList(){
        return filmService.getFilmListService();

    }*/

    /*@GetMapping("/{public_user_id}")
    public String getFilm(@PathVariable("public_user_id") String public_user_id , Model model){
        model.addAttribute("film", filmService.getFilmInfo(public_user_id));
        return "/films/film";
    }*/
}
