package org.blue.dwbackendmysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.MovieGradeDTO;

import java.util.List;

@Mapper
public interface MovieGradeMapper {
    @Select("SELECT m.movieName, m.runTime,m.commentNum, m.type, m.grade, m.year, m.month, m.day " +
            "FROM movie m " +
            "Where (m.grade >= #{grade} OR m.grade IS NULL OR #{grade} IS NULL) " +
            "AND m.grade IS NOT NULL")
    List<MovieGradeDTO> findMovieByGrade(@Param("grade")float grade);

    @Select("SELECT m.movieName, m.runTime,m.commentNum, m.type, m.grade, m.year, m.month, m.day " +
            "FROM movie m " +
            "Where (m.grade >= #{good} OR m.grade IS NULL OR #{good} IS NULL) " +
            "AND m.grade IS NOT NULL")
    List<MovieGradeDTO> findMovieByGood(@Param("good")float good);
}
