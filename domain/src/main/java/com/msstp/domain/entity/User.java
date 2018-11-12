package com.msstp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Builder
public class User {
  @Id
  private String id;

  @Indexed(unique = true)
  private String userName;

  @Indexed(unique = true)
  private String email;
}
