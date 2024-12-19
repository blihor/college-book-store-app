package com.college.store.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BookDTO {

    Integer id;
    String name;
    String author;
    Integer year;
    Integer pages;
    Integer rate;
    String genres;
}
