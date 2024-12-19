package com.college.store.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.college.store.model.Book;

@Repository
public interface BookRepository extends ListCrudRepository<Book, Integer> {

}
