package org.blue.dwbackendmysql.service;


import org.blue.dwbackendmysql.dto.MovieActDTO;
import org.blue.dwbackendmysql.mapper.MovieActMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieActService {
    @Autowired
    private MovieActMapper movieActMapper;

    public List<MovieActDTO> findMovieByAct(String actName, String isStarring) {
        return movieActMapper.findMoviesByAct(actName, isStarring);
    }

    public List<MovieActDTO> findMovieByActT(String actName) {
        return movieActMapper.findMoviesByActT(actName);
    }

    public List<MovieActDTO> findMovieByActF(String actName) {
        return movieActMapper.findMoviesByActF(actName);
    }

}
