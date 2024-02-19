package com.mymovies.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

  @Id
  private ObjectId id;

  private String body;

  public Review(String body) {
    this.body = body;
  }

}
