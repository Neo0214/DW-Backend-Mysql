package org.blue.dwbackendmysql.service;

import org.blue.dwbackendmysql.dto.MovieStyleDTO;
import org.blue.dwbackendmysql.mapper.MovieStyleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieStyleService {
    @Autowired
    private MovieStyleMapper movieStyleMapper;
    public List<MovieStyleDTO> findMovieByStyle(String style) {
        return movieStyleMapper.findMovieByStyle(style);
    }
}
