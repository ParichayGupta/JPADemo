package com.learning.JPADemo.OneToManyMapping.UniDirectional;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "author_id")
    private List<Book> books = new ArrayList<>();

}