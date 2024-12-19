package com.college.store.repository;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.college.store.model.Genre;

@Repository
public interface GenreRepository extends ListCrudRepository<Genre, Integer>{

    Optional<Genre> findByName(String name);
}
