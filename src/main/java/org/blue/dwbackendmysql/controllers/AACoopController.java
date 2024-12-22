package org.blue.dwbackendmysql.controllers;

import org.blue.dwbackendmysql.dto.AACoopDTO;
import org.blue.dwbackendmysql.dto.MovieActDTO;
import org.blue.dwbackendmysql.service.AACoopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AACoopController {
    @Autowired
    private AACoopService AACoopService0;
    @GetMapping("/coop/aa")
    public ResponseEntity<Map<String, Object>> findAANumBiggest() {
        long startTime = System.currentTimeMillis();
        List<AACoopDTO> movieAct=AACoopService0.findAANumBiggest();
        long endTime = System.currentTimeMillis();

        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）

        return ResponseEntity.ok(response);
    }

}
