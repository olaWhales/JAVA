package org.example.services;


import org.example.data.model.User;
import org.example.data.repositories.UserRepository;
import org.example.dtos.CreateUserRequest;
import org.example.dtos.CreateUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        CreateUserResponse response = new CreateUserResponse();
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());
        user.setUserEmail(request.getUserEmail());
        userRepository.save(user);
        response.setMessage("Successfully created user");
        return response;
    }
}
