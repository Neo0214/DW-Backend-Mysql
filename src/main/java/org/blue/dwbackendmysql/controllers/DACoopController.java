package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.dto.DACoopDTO;

import org.blue.dwbackendmysql.service.DACoopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DACoopController {
    @Autowired
    private DACoopService DACoopService0;
    @GetMapping("/coop/da")
    public ResponseEntity<Map<String, Object>> findDANumBiggest() {
        long startTime = System.currentTimeMillis();
        List<DACoopDTO> movieAct=DACoopService0.findDANumBiggest();
        long endTime = System.currentTimeMillis();

        Map<String, Object> response = new HashMap<>();
        response.put("data", movieAct);          // 查询结果
        response.put("time", endTime - startTime); // 查询时间（毫秒）

        return ResponseEntity.ok(response);
    }
}
