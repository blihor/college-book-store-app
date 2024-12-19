package com.college.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table(name = "genre")
@AllArgsConstructor
public class Genre {

    @Id
    private int Id;

    @Column("name")
    String name;
}
