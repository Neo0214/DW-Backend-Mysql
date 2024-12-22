package org.blue.dwbackendmysql.service;

import org.blue.dwbackendmysql.dto.AACoopDTO;
import org.blue.dwbackendmysql.mapper.AACoopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AACoopService {
    @Autowired
    private AACoopMapper AACoopMapper;
    public List<AACoopDTO> findAANumBiggest(){
        return AACoopMapper.findAANumBiggest();
    }
}
