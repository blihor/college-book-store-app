package com.college.store.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.college.store.model.Book;
import com.college.store.model.Genre;
import com.college.store.model.GenreReference;
import com.college.store.repository.BookRepository;
import com.college.store.repository.GenreRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(String name, String author, Integer year,
                            Integer pages, Integer rate, Set<String> genreNames) {
                            
        Book book = Book.builder()
                        .name(name)
                        .author(author)
                        .year(year)
                        .pages(pages)
                        .rate(rate)
                        .genres(new HashSet<>())
                        .build();

        Set<Genre> genres = genreNames
                                .stream()
                                .map(genreName -> genreRepository.findByName(genreName).orElseThrow())
                                .collect(Collectors.toSet());


        genres.forEach(genre -> {
            book.addGenre(genre);
        });

        return bookRepository.save(book);
    }

    public Set<Genre> findAllGenres(Integer bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));

        Set<GenreReference> genreReferences = book.getGenres();

        return genreReferences.stream()
                    .map(ref -> genreRepository.findById(ref.getGenreId())
                            .orElseThrow(() -> new RuntimeException("Genre not found")))
                    .collect(Collectors.toSet());
    }

    public Book deleteAllGenres(Integer bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        book.deleteAllGenres();

        return bookRepository.save(book);
    }
}
