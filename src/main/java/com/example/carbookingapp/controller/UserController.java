package com.example.carbookingapp.controller;

import com.example.carbookingapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.carbookingapp.service.UserService;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}