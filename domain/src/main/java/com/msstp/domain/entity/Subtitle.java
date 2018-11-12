package com.msstp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("subtitles")
@Getter
@Builder
public class Subtitle {
  @Id
  private String id;

  @Indexed
  private String version;

  @DBRef
  private List<SubtitleLine> lines;

  @DBRef(lazy = true)
  private List<Subtitle> sources;

  private boolean isSource(){
    return sources.isEmpty();
  }
}