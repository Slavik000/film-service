package com.stepanenko.filmmicroservice.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Film {
    @Id
    private String id;

    @Indexed(unique = true)
    private String public_film_id;
    private String film_name;
    private int duration_minutes;

    public Film(String public_film_id, String film_name, int duration_minutes) {
        this.public_film_id=public_film_id;
        this.film_name = film_name;
        this.duration_minutes = duration_minutes;

    }
}
