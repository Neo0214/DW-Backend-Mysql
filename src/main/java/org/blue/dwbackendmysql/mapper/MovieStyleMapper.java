package org.blue.dwbackendmysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.MovieStyleDTO;

import java.util.List;

@Mapper
public interface MovieStyleMapper {
    @Select("SELECT  m.movieName, m.runTime, m.commentNum, m.type, m.grade, m.year, m.month, m.day FROM movie m WHERE m.type LIKE CONCAT('%', #{type}, '%')")
    List<MovieStyleDTO> findMovieByStyle(@Param("type")String type);
}
