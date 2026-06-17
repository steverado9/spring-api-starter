package com.codewithmosh.store.controllers;

import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
