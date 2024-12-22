package org.blue.dwbackendmysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.AACoopDTO;

import java.util.List;

@Mapper
public interface AACoopMapper {
    @Select("SELECT d.personName, a.personName , c.num FROM AACoopTime c JOIN person d ON c.firstActorId = d.personId JOIN person a ON c.secondActorId = a.personId ORDER BY c.num DESC LIMIT 1;")
    List<AACoopDTO> findAANumBiggest();
}
