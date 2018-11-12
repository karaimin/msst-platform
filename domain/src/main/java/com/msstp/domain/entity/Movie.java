package com.msstp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.util.Set;

@Document("movies")
@Getter
@Builder
public class Movie {

  @Id
  private String id;

  private String name;
  private Duration duration;
  private String description;

  private Set<Subtitle> subtitles;
}
