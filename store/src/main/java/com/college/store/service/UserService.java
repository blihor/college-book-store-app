package com.college.store.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.college.store.model.Book;
import com.college.store.model.BookReference;
import com.college.store.model.User;
import com.college.store.repository.BookRepository;
import com.college.store.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    private final BookService bookService;

    public User addUser(String username, String email, String password) {
        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            throw new RuntimeException("Fill up all the fields!");
        }

        User user = new User(null, username, email, password, null);

        return userRepository.save(user);
    }

    public boolean validateUser(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            throw new RuntimeException("Enter username and password!");
        }

        User user = userRepository
                        .findByUsername(username)
                        .orElseThrow(() -> new RuntimeException("User with given credentials was not found!"));

        if (password.equals(user.getPassword())) {
            return true;
        }

        return false;
    }

    public boolean userExists(String username) {
        if (username.isEmpty()) {
            throw new RuntimeException("Username isn't specified!");
        }

        Optional<User> user = userRepository.findByUsername(username);

        return user.isPresent() ? true : false;
    }

    public boolean emailUsed(String email) {
        if (email.isEmpty()) {
            throw new RuntimeException("Email isn't specified!");
        }

        Optional<User> user = userRepository.findByEmail(email);

        return user.isPresent() ? true : false;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
                    .orElseThrow(() -> new RuntimeException("User is not found"));
    }

    public List<Book> findAllBooks(int userId) {
        User user = userRepository.findById(userId)
                                    .orElseThrow(() -> new RuntimeException("User not found"));
        Set<BookReference> books = user.getBooks();

        return books.stream()
                    .map(ref -> bookRepository.findById(ref.getBookId())
                    .orElseThrow(() -> new RuntimeException("Book doesn't exist")))
                    .collect(Collectors.toList());
    }

    public User addBook(Integer userId, String name, String author, int year,
                            int pages, int rate, Set<String> genreNames) {
        
        Book book = bookService.addBook(name, author, year, pages, rate, genreNames);
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        user.addBook(book);
        return userRepository.save(user);
    }

    public User deleteBook(Integer userId, Integer bookId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        // Prepare book to deletion(remove all genre references) 
        Book book = bookService.deleteAllGenres(bookId);

        user.deleteBook(book);
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
