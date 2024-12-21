package org.blue.dwbackendmysql.service;

import org.blue.dwbackendmysql.dto.MovieTypeDTO;
import org.blue.dwbackendmysql.mapper.MovieTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieTypeService {
    @Autowired
    private MovieTypeMapper movieTypeMapper;

    public List<MovieTypeDTO> findMoviesTypeByName(String movieName) {
        return movieTypeMapper.findMoviesTypeByName(movieName);
    }
}
