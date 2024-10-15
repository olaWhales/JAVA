package org.example.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.lang.annotation.Documented;


@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

}
