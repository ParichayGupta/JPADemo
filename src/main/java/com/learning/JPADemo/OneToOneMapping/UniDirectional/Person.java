package com.learning.JPADemo.OneToOneMapping.UniDirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "Passport_Id")
    private Passport passport;


    /* One Person can have only one passport

    person      Passport
        1           1
    */

}
