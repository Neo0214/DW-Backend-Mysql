package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.dto.MovieDirectDTO;
import org.blue.dwbackendmysql.dto.MovieTimeDTO;

import org.blue.dwbackendmysql.service.MovieTimeService;
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

public class MovieTimeController {

    @Autowired
    private MovieTimeService movieTimeService;

    @GetMapping("/byTime/count/yearMonth")
    public ResponseEntity<Map<String, Object>> getMoviesByYearMonth(@RequestParam("year") int year,@RequestParam("month") int month) {
        long startTime = System.currentTimeMillis();
        List<MovieTimeDTO> movieAct=movieTimeService.findMovieByYearMonth(year, month);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);

    }

    @GetMapping("/byTime/count/yearSeason")
    public ResponseEntity<Map<String, Object>> getMoviesByYearSeason(@RequestParam("year") int year,@RequestParam("season") int season) {
        long startTime = System.currentTimeMillis();
        List<MovieTimeDTO> movieAct=movieTimeService.findMovieByYearSeason(year, season);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);

    }

    @GetMapping("/byTime/count/yearMonthDay")
    public ResponseEntity<Map<String, Object>> getMoviesByStartEnd(@RequestParam("startYear") int startYear,@RequestParam("startMonth") int startMonth,@RequestParam("startDay") int startDay, @RequestParam("endYear") int endYear,@RequestParam("endMonth") int endMonth,@RequestParam("endDay") int endDay) {
        long startTime = System.currentTimeMillis();
        List<MovieTimeDTO> movieAct=movieTimeService.findMovieByStartEnd(startYear, startMonth, startDay, endYear, endMonth, endDay);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);

    }
}
