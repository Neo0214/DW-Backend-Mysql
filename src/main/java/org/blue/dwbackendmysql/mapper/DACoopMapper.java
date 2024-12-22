package org.blue.dwbackendmysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.DACoopDTO;

import java.util.List;

@Mapper
public interface DACoopMapper {
    @Select("SELECT d.personName, a.personName AS actorName, c.num FROM DACoopTime c JOIN person d ON c.directorId = d.personId JOIN person a ON c.actorId = a.personId ORDER BY c.num DESC LIMIT 1;")
    List<DACoopDTO> findDANumBiggest();
}

