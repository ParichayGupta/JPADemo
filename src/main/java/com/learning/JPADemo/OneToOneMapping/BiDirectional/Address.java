package com.learning.JPADemo.OneToOneMapping.BiDirectional;

import jakarta.persistence.*;

@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "address")
    private User user;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private int pinCode;

}
