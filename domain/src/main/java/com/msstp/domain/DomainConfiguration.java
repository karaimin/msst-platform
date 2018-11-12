package com.msstp.domain;

import com.msstp.domain.service.MovieService;
import com.msstp.domain.service.impl.MovieServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories
public class DomainConfiguration {
  @Bean
  public MovieService getMovieService() {
    return new MovieServiceImpl();
  }
}
