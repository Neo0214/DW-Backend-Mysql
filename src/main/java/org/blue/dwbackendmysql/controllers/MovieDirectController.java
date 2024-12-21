package org.blue.dwbackendmysql.controllers;

import org.blue.dwbackendmysql.dto.MovieActDTO;
import org.blue.dwbackendmysql.dto.MovieDirectDTO;
import org.blue.dwbackendmysql.service.MovieDirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class MovieDirectController {

    @Autowired
    private MovieDirectService movieDirectService;

    @GetMapping("/director/dirmovie")
    public ResponseEntity<Map<String, Object>> getMoviesByDirectorName(@RequestParam("directorName") String directorName) {

        long startTime = System.currentTimeMillis();
        List<MovieDirectDTO> movieAct=movieDirectService.findMoviesByDirectorName(directorName);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);

    }
}
