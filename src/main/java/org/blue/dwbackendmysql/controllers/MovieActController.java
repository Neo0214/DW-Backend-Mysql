package org.blue.dwbackendmysql.controllers;

import org.blue.dwbackendmysql.dto.MovieActDTO;
import org.blue.dwbackendmysql.service.MovieActService;
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

public class MovieActController {

    @Autowired
    private MovieActService movieActService;

    @GetMapping("/actTF")
    public ResponseEntity<Map<String, Object>> getMoviesByAct(@RequestParam("actorName") String actName) {
        long startTime = System.currentTimeMillis();
        List<MovieActDTO> movieAct=movieActService.findMovieByAct(actName);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/actT")
    public ResponseEntity<Map<String, Object>> getMoviesByActT(@RequestParam("actorName") String actName) {
        long startTime = System.currentTimeMillis();
        List<MovieActDTO> movieAct=movieActService.findMovieByActT(actName);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/actF")
    public ResponseEntity<Map<String, Object>> getMoviesByActF(@RequestParam("actorName") String actName) {
        long startTime = System.currentTimeMillis();
        List<MovieActDTO> movieAct=movieActService.findMovieByActF(actName);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);
    }
}
