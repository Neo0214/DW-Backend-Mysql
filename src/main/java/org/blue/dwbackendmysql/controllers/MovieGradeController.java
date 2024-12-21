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
@RequestMapping("/api/movies")
public class MovieGradeController {

    @Autowired
    private MovieGradeService movieGradeService;

    @GetMapping("/grade")
    public List<MovieGradeDTO> getMoviesByGrade(@RequestParam("grade") float grade) {
        return movieGradeService.findMovieByGrade(grade);
    }

    @GetMapping("/good")
    public List<MovieGradeDTO> getMoviesByGood(@RequestParam("good") float good) {
        return movieGradeService.findMovieByGrade(good);
    }
}
