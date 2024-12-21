package org.blue.dwbackendmysql.service;

import org.blue.dwbackendmysql.dto.MovieTimeDTO;
import org.blue.dwbackendmysql.mapper.MovieTimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieTimeService {
    @Autowired
    MovieTimeMapper movieTimeMapper;

    public List<MovieTimeDTO> findMovieByYearMonth(int year, int month) {
        return movieTimeMapper.findMovieByYearMonth(year, month);
    }

    public List<MovieTimeDTO> findMovieByYearSeason(int year, int season) {
        return movieTimeMapper.findMovieByYearSeason(year, season);
    }

    public List<MovieTimeDTO> findMovieByStartEnd(int startYear, int startMonth,int startDay, int endYear, int endMonth, int endDay) {
        return movieTimeMapper.findMovieByStartEnd(startYear, startMonth, startDay, endYear, endMonth, endDay);
    }
}
