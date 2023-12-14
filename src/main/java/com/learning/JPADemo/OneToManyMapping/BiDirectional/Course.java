package com.learning.JPADemo.OneToManyMapping.BiDirectional;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;
    
    
    String Authour;
}
