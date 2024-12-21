package org.blue.dwbackendmysql.service;

import org.blue.dwbackendmysql.dto.MovieDirectDTO;
import org.blue.dwbackendmysql.mapper.MovieDirectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieDirectService {
    @Autowired

    private MovieDirectMapper movieDirectMapper;

    public List<MovieDirectDTO> findMoviesByDirectorName(String directorName) {
        return movieDirectMapper.findMoviesByDirectorName(directorName);
    }
}
