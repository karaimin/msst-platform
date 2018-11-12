package com.msstp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@Document("ratings")
public class LineVersionRating {
  private short rating;

  @DBRef
  private User ownerId;

  private String comment;

}
