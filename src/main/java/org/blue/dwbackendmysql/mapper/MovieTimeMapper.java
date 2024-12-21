package org.blue.dwbackendmysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.dto.MovieTimeDTO;

import java.util.List;

@Mapper
public interface MovieTimeMapper {
    @Select("SELECT m.movieName, m.runTime,m.commentNum, m.type, m.grade, m.year, m.month, m.day " +
            "FROM movie m " +
            "WHERE m.year = #{year} " +
            "AND (m.month = #{month} OR m.month IS NULL OR #{month} IS NULL) " +
            "AND m.month IS NOT NULL")
    List<MovieTimeDTO>findMovieByYearMonth(@Param("year")int year, @Param("month")int month);

    @Select("SELECT m.movieName, m.runTime,m.commentNum, m.type, m.grade, m.year, m.month, m.day " +
            "FROM movie m " +
            "WHERE m.year = #{year} " +
            "AND ((m.month >= 1 AND m.month <= 3 AND #{season} = 1) " +
            "     OR (m.month >= 4 AND m.month <= 6 AND #{season} = 2) " +
            "     OR (m.month >= 7 AND m.month <= 9 AND #{season} = 3) " +
            "     OR (m.month >= 10 AND m.month <= 12 AND #{season} = 4))")
    List<MovieTimeDTO>findMovieByYearSeason(@Param("year")int year, @Param("season")int season);

    @Select("SELECT m.movieName, m.runTime,m.commentNum, m.type, m.grade, m.year, m.month, m.day " +
            "FROM movie m " +
            "WHERE (m.year > #{startYear} OR (m.year = #{startYear} AND (m.month > #{startMonth} OR (m.month = #{startMonth} AND m.day >= #{startDay})))) " +
            "AND (m.year < #{endYear} OR (m.year = #{endYear} AND (m.month < #{endMonth} OR (m.month = #{endMonth} AND m.day <= #{endDay}))))")
    List<MovieTimeDTO>findMovieByStartEnd(@Param("startYear")int startYear, @Param("startMonth")int startMonth, @Param("startDay")int startDay,@Param("endYear")int endYear, @Param("endMonth")int endMonth, @Param("endDay")int endDay);

}
