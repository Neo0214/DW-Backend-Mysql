package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.dto.MovieTimeDTO;

import org.blue.dwbackendmysql.service.MovieTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieTimeController {

    @Autowired
    private MovieTimeService movieTimeService;

    @GetMapping("/YearMonth")
    public List<MovieTimeDTO> getMoviesByYearMonth(@RequestParam("year") int year,@RequestParam("month") int month) {
        return movieTimeService.findMovieByYearMonth(year, month);
    }

    @GetMapping("/YearSeason")
    public List<MovieTimeDTO> getMoviesByYearSeason(@RequestParam("year") int year,@RequestParam("season") int season) {
        return movieTimeService.findMovieByYearSeason(year, season);
    }

    @GetMapping("/StartEnd")
    public List<MovieTimeDTO> getMoviesByStartEnd(@RequestParam("startYear") int startYear,@RequestParam("startMonth") int startMonth,@RequestParam("startDay") int startDay, @RequestParam("endYear") int endYear,@RequestParam("endMonth") int endMonth,@RequestParam("endDay") int endDay) {
        return movieTimeService.findMovieByStartEnd(startYear, startMonth, startDay, endYear, endMonth, endDay);
    }
}
