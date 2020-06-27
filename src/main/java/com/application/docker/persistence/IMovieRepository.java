package com.application.docker.persistence;

import com.application.docker.persistence.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends MongoRepository<Movie, String> {
}
