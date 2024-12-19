package com.college.store.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.college.store.model.Genre;
import com.college.store.repository.GenreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository genreRepository;

    public Set<Genre> findAllGenres() {
        return genreRepository.findAll().stream().collect(Collectors.toSet());
    }
}
