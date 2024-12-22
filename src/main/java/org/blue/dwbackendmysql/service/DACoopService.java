package org.blue.dwbackendmysql.service;

import org.blue.dwbackendmysql.dto.DACoopDTO;
import org.blue.dwbackendmysql.mapper.DACoopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DACoopService {
    @Autowired
    private DACoopMapper DACoopMapper;
    public List<DACoopDTO> findDANumBiggest(){
        return DACoopMapper.findDANumBiggest();
    }
}
