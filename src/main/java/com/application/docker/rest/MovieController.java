package com.application.docker.rest;

import com.application.docker.dto.MovieDto;
import com.application.docker.persistence.model.Movie;
import com.application.docker.service.IMovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/movie")
public class MovieController {

  private IMovieService movieService;

  @PostMapping
  public ResponseEntity get(@RequestBody final MovieDto movieDto) {
    Movie movie = getMovieToCreate(movieDto);
    Movie createdMovie = movieService.create(movie);
    return ResponseEntity.ok(MovieDto.builder()
        .movieName(createdMovie.getMovieName())
        .category(createdMovie.getCategory())
        .build());
  }

  private Movie getMovieToCreate(MovieDto movieDto) {
    return Movie.builder()
        .movieName(movieDto.getMovieName())
        .category(movieDto.getCategory())
        .build();
  }
}
