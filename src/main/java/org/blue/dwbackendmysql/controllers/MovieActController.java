package org.blue.dwbackendmysql.controllers;

import org.blue.dwbackendmysql.dto.MovieActDTO;
import org.blue.dwbackendmysql.service.MovieActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieActController {

    @Autowired
    private MovieActService movieActService;

    @GetMapping("/act")
    public List<MovieActDTO> getMoviesByAct(@RequestParam("actName") String actName) {
        return movieActService.findMovieByAct(actName);
    }

    @GetMapping("/actT")
    public List<MovieActDTO> getMoviesByActT(@RequestParam("actName") String actName) {
        return movieActService.findMovieByActT(actName);
    }

    @GetMapping("/actF")
    public List<MovieActDTO> getMoviesByActF(@RequestParam("actName") String actName) {
        return movieActService.findMovieByActF(actName);
    }
}
