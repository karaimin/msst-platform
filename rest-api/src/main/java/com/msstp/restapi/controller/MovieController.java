package com.msstp.restapi.controller;

import com.msstp.domain.entity.Movie;
import com.msstp.domain.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/movies")
public class MovieController {

  @Autowired
  private MovieService movieService;

  @GetMapping
  public Flux<Movie> getMovies(){
    return movieService.getAllMovies();
  }
}
