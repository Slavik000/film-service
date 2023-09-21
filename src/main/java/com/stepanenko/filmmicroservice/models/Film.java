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
    private String name;

    public Film(String public_film_id, String name) {
        this.public_film_id = public_film_id;
        this.name = name;
    }
}
