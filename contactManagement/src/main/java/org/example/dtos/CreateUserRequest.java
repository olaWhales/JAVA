package org.example.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String userEmail;
    private String password;
}
