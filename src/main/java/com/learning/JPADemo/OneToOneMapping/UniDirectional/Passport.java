package com.learning.JPADemo.OneToOneMapping.UniDirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String passportNumber;
}
