package com.college.store.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "book_genre")
@AllArgsConstructor
@NoArgsConstructor
public class GenreReference {

    @Column("genre_ID")
    private int genreId;
}
