package org.blue.dwbackendmysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.MovieDirectDTO;

import java.util.List;
@Mapper
public interface MovieDirectMapper {
    @Select("select p.personName, m.movieName,m.runTime, m.commentNum, m.type, m.grade, m.year, m.month, m.day FROM person p JOIN movieDirect md ON p.personId = md.directId JOIN movie m ON md.movieId = m.movieId WHERE p.personName = #{directorName}")
    List<MovieDirectDTO> findMoviesByDirectorName(@Param("directorName")String directorName);
}
