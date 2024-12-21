package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.dto.MovieTypeDTO;
import org.blue.dwbackendmysql.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController

public class MovieTypeController {
    @Autowired
    private MovieTypeService movieTypeService;

    @GetMapping("/byMovieName/count/format")
    public List<MovieTypeDTO> getMovieDetails(@RequestParam("movieName") String movieName) {
        return movieTypeService.findMoviesTypeByName(movieName);
    }


}
