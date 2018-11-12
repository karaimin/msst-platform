package com.msstp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.util.Set;

@Document("subtitleLines")
@Getter
@Builder
public class SubtitleLine {
  @Id
  private String id;

  private Duration startTime;
  private Duration endTime;

  private Set<LineVersion> lineVersions;
}
