package org.example.services;


import org.example.data.model.User;
import org.example.dtos.CreateUserRequest;
import org.example.dtos.CreateUserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        return null;
    }
}
