package org.blue.dwbackendmysql.service.impl;


import org.blue.dwbackendmysql.Entity.Test;
import org.blue.dwbackendmysql.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/*
 * @author Neo0214
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public HashMap<String, Object> getAllTest() {
        HashMap<String, Object> map = new HashMap<>();
        List<Test> testList = testMapper.getAllTest();
        map.put("testList", testList);
        return map;
    }
}
