package org.blue.dwbackendmysql.service;


import org.blue.dwbackendmysql.Entity.Test;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/*
 * @author Neo0214
 */

public interface TestService {
    public HashMap<String, Object> getAllTest();
}
