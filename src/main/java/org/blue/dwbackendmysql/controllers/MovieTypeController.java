package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.dto.MovieDirectDTO;
import org.blue.dwbackendmysql.dto.MovieTypeDTO;
import org.blue.dwbackendmysql.service.MovieTypeService;
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

public class MovieTypeController {
    @Autowired
    private MovieTypeService movieTypeService;

    @GetMapping("/byMovieName/count/format")
    public ResponseEntity<Map<String, Object>> getMovieDetails(@RequestParam("movieName") String movieName) {
        long startTime = System.currentTimeMillis();
        List<MovieTypeDTO> movieAct=movieTypeService.findMoviesTypeByName(movieName);
        long endTime = System.currentTimeMillis();
        int num = movieAct.size();
        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）
        response.put("num", num);
        return ResponseEntity.ok(response);

    }


}
