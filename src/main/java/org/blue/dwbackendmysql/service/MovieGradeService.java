package org.blue.dwbackendmysql.service;

import org.blue.dwbackendmysql.dto.MovieGradeDTO;
import org.blue.dwbackendmysql.mapper.MovieGradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieGradeService {
    @Autowired
    MovieGradeMapper movieGradeMapper;
    public List<MovieGradeDTO> findMovieByGrade(float grade) {
        return movieGradeMapper.findMovieByGrade(grade);
    }
    public List<MovieGradeDTO> findMovieByGood(float good) {
        return movieGradeMapper.findMovieByGrade(good);
    }
}
