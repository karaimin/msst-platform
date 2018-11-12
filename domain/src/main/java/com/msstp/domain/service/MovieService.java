package com.msstp.domain.service;

import com.msstp.domain.entity.Movie;
import reactor.core.publisher.Flux;

public interface MovieService {
  Flux<Movie> getAllMovies();
}
