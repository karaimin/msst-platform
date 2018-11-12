package com.msstp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Builder
@Document("versions")
public class LineVersion {

  private String version;
  private String text;

  @DBRef(lazy = true)
  private User owner;

  private Set<LineVersionRating> ratings;

  public void getOverallVersion(){
    short x = 5;
    ratings.stream().map(rating -> (int) rating.getRating()).reduce(Integer::sum).orElse(0);
  }
}
