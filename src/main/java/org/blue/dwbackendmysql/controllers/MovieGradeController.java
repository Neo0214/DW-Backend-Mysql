package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.dto.MovieDirectDTO;
import org.blue.dwbackendmysql.dto.MovieGradeDTO;

import org.blue.dwbackendmysql.service.MovieGradeService;
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

public class MovieGradeController {

    @Autowired
    private MovieGradeService movieGradeService;

    @GetMapping("/byComment/score")
    public ResponseEntity<Map<String, Object>> getMoviesByGrade(@RequestParam("score") float grade) {
        long startTime = System.currentTimeMillis();
        List<MovieGradeDTO> movieAct=movieGradeService.findMovieByGrade(grade);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);

    }

    @GetMapping("/byComment/rate")
    public ResponseEntity<Map<String, Object>> getMoviesByGood(@RequestParam("rate") float good) {
        long startTime = System.currentTimeMillis();
        List<MovieGradeDTO> movieAct=movieGradeService.findMovieByGood(good);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);

    }
}
