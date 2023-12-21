package com.example.Demo.rest;

import com.example.Demo.entity.User;
import com.example.Demo.repository.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://proud-glacier-0b3ed670f.4.azurestaticapps.net/")
@RestController
public class UserRestController {

    private final UserRepository userRepository;

    UserRestController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    List<User> all(){
        return userRepository.findAll();
    }
}
