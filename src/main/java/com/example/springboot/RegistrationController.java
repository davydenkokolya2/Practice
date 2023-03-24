package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistrationController {
    @Autowired
    UserService userService;

    @PostMapping("/registration")
    public Boolean createUser(@RequestBody UserDTO userDTO) {

        return userService.saveUser(userDTO);
    }

}
