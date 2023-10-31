package com.learning.JPADemo.OneToManyMapping.BiDirectional;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses = new ArrayList<>();

}