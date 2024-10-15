package org.example.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class UserServicesTest {


    @Test
    public void testThatUserCanRegister() {
        CreateUserRequest request = new CreateUserRequest();
        request.setfirstName("Olawale");
        request.setlastName("Ishola");
        request.setuserEmail("ajaditaoreed@gmail.com");
        request.setpassword("12345");
    }
}