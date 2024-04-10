package com.example.carbookingapp.service;

import com.example.carbookingapp.model.User;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


public interface UserService {
    public void addUser(User user);

    public User getUserByName(String name);

    public List<User> getAllUsers();

    public boolean isUserExists(String name);

}