package com.application.docker.service;

import com.application.docker.persistence.model.Movie;

public interface IMovieService {
  Movie create (Movie entity);
}
