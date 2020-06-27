package com.application.docker.service.impl;

import com.application.docker.persistence.IMovieRepository;
import com.application.docker.persistence.model.Movie;
import com.application.docker.service.IMovieService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class MovieServiceImpl implements IMovieService {
  private IMovieRepository movieRepository;

  public Movie create (Movie entity) {
    entity.setId(UUID.randomUUID().toString());
    entity.setCreatedDate(new Date());
    entity.setUpdatedDate(new Date());

    return movieRepository.save(entity);
  }
}
