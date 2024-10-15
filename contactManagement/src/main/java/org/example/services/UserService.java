package org.example.services;

import org.example.dtos.CreateUserRequest;
import org.example.dtos.CreateUserResponse;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest request);
}
