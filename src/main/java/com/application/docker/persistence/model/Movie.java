package com.application.docker.persistence.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "movies")
@Builder
@Getter
@Setter
public class Movie {
  @Id
  @Field(name = "movie_id")
  public String id;

  @Field(name = "movie_name")
  public String movieName;

  @Field(name = "category")
  public String category;

  @JsonFormat(pattern = "yyyy-mm-dd")
  @Field(name = "created_date")
  public Date createdDate;

  @JsonFormat(pattern = "yyyy-mm-dd")
  @Field(name = "updated_date")
  public Date updatedDate;
}
