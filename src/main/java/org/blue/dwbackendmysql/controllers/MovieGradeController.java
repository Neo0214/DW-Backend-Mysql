package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.dto.MovieGradeDTO;

import org.blue.dwbackendmysql.service.MovieGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MovieGradeController {

    @Autowired
    private MovieGradeService movieGradeService;

    @GetMapping("/byComment/score")
    public List<MovieGradeDTO> getMoviesByGrade(@RequestParam("grade") float grade) {
        return movieGradeService.findMovieByGrade(grade);
    }

    @GetMapping("/byComment/rate")
    public List<MovieGradeDTO> getMoviesByGood(@RequestParam("good") float good) {
        return movieGradeService.findMovieByGood(good);
    }
}
