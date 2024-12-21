package org.blue.dwbackendmysql.controllers;

import org.blue.dwbackendmysql.dto.MovieDirectDTO;
import org.blue.dwbackendmysql.service.MovieDirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieDirectController {

    @Autowired
    private MovieDirectService movieDirectService;

    @GetMapping("/director")
    public List<MovieDirectDTO> getMoviesByDirectorName(@RequestParam("directorName") String directorName) {
        return movieDirectService.findMoviesByDirectorName(directorName);
    }
}
