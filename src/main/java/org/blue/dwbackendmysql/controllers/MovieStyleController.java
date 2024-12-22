package org.blue.dwbackendmysql.controllers;

import org.blue.dwbackendmysql.dto.MovieStyleDTO;
import org.blue.dwbackendmysql.service.MovieStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MovieStyleController {
    @Autowired
    private MovieStyleService movieStyleService;
    @GetMapping("/byTypeName/count")
    public ResponseEntity<Map<String, Object>> findMovieByStyle(@RequestParam("typeName") String Style){
        long startTime = System.currentTimeMillis();
        List<MovieStyleDTO> movieAct=movieStyleService.findMovieByStyle(Style);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);


    }
}
