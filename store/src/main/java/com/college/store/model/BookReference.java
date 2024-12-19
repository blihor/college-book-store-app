package com.college.store.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "usr_book")
@AllArgsConstructor
@NoArgsConstructor
public class BookReference {
    @Column("book_ID")
    private int bookId;
}
