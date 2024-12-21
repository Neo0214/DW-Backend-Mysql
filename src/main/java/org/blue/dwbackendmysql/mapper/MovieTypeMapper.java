package org.blue.dwbackendmysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.MovieTypeDTO;

import java.util.List;
@Mapper
public interface MovieTypeMapper {

    @Select("select m.movieName, m.runTime, m.commentNum, m.type, m.grade, m.year, m.month, m.day, p.format FROM movie m LEFT JOIN product p ON m.movieId = p.movieId WHERE m.movieName = #{movieName}")
    List<MovieTypeDTO> findMoviesTypeByName(@Param("movieName") String movieName);
}
