package com.stepanenko.filmmicroservice.models;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmsRepository extends MongoRepository<Film,String> {
}
