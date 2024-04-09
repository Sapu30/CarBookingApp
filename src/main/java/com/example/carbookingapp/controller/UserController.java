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

    @PostMapping("/add/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }


    @PostMapping("/addAll")
    public void addUsers(@RequestBody List<User> userList) {
        for (User user : userList) {
            userService.addUser(user);
        }
    }

    @GetMapping("/user")
    public User getUser(String name) {
        return userService.getUserByName(name);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

//    @DeleteMapping("/delete/user")
//    public void deleteUser(@PathVariable User user) {
//        userService.deleteUser(user.getName());
//    }
}