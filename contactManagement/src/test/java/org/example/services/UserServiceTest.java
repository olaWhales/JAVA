package org.example.services;

import org.example.dtos.CreateUserRequest;
import org.example.dtos.CreateUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void testThatUserCanRegister(){
         CreateUserRequest request = new CreateUserRequest();
            request.setFirstName("Wale");
            request.setLastName("John");
            request.setUserEmail("walejohn@gmail.com");
            request.setPassword("12345");
            CreateUserResponse response = userService.createUser(request);
            assertThat(response).isNotNull();
            assertThat(response.getMessage()).isEqualTo("Successfully created user");
        }
}