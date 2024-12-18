package org.blue.dwbackendmysql.controllers;


import org.blue.dwbackendmysql.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*
 * @author Neo0214
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public HashMap<String,Object> test() {
        return testService.getAllTest();
    }
}
