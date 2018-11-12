package com.msstp.domain.service.impl;

import com.msstp.domain.entity.Movie;
import com.msstp.domain.repository.MovieRepository;
import com.msstp.domain.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;

public class MovieServiceImpl implements MovieService {

  @Autowired
  private MovieRepository movieRepository;

  @Override
  public Flux<Movie> getAllMovies() {
    return movieRepository.findAll();
  }
}
