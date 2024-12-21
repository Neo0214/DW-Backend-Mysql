package org.blue.dwbackendmysql.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.MovieActDTO;

import java.util.List;

@Mapper
public interface MovieActMapper {
    @Select("select p.personName, m.movieName,m.runTime, m.commentNum, m.type, m.grade, m.year, m.month, m.day FROM person p JOIN movieAct ma ON p.personId = ma.userId JOIN movie m ON ma.movieId = m.movieId WHERE p.personName = #{actName}")
    List<MovieActDTO> findMoviesByAct(@Param("actName")String actName);

    @Select("select p.personName, m.movieName,m.runTime, m.commentNum, m.type, m.grade, m.year, m.month, m.day FROM person p JOIN movieAct ma ON p.personId = ma.userId JOIN movie m ON ma.movieId = m.movieId WHERE p.personName = #{actName} and ma.isStarring = 'T'")
    List<MovieActDTO> findMoviesByActT(@Param("actName")String actName);

    @Select("select p.personName, m.movieName,m.runTime, m.commentNum, m.type, m.grade, m.year, m.month, m.day FROM person p JOIN movieAct ma ON p.personId = ma.userId JOIN movie m ON ma.movieId = m.movieId WHERE p.personName = #{actName} and ma.isStarring = 'F'")
    List<MovieActDTO> findMoviesByActF(@Param("actName")String actName);
}

