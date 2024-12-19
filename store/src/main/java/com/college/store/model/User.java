package com.college.store.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table(name = "usr")
@AllArgsConstructor
public class User {
    @Id
    private Integer id;

    @Column("username")
    private String username;

    @Column("email")
    private String email;

    @Column("password")
    private String password;

    private Set<BookReference> books;

    public void addBook(Book book) {
        this.books.add(createBookReference(book));
    }

    public void deleteBook(Book book) {
        books.removeIf((ref) -> ref.getBookId() == book.getId());
    }

    private BookReference createBookReference(Book book) {
        BookReference bookReference = new BookReference();
        bookReference.setBookId(book.getId());

        return bookReference;
    }
}
