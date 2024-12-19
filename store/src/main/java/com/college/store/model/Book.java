package com.college.store.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Table(name = "book")
@AllArgsConstructor
@Builder
public class Book {

    @Id
    private int id;

    @Column("name")
    String name;

    @Column("author")
    String author;

    @Column("year_of_publication")
    int year;

    @Column("pages")
    int pages;

    @Column("rate")
    int rate;

    Set<GenreReference> genres;

    public void addGenre(Genre genre) {
        genres.add(createGenreReference(genre));
    }

    public void deleteGenre(Genre genre) {
        genres.removeIf((ref) -> ref.getGenreId() == genre.getId());
    }

    public void deleteAllGenres() {
        genres.clear();
    }

    private GenreReference createGenreReference(Genre genre) {
        GenreReference genreReference = new GenreReference();
        genreReference.setGenreId(genre.getId());

        return genreReference;
    }
}
