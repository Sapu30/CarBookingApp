package com.example.carbookingapp.serviceImpl;

import com.example.carbookingapp.model.User;
import com.example.carbookingapp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        if (!isUserExists(user.getName())) {
            users.add(user);
        } else {
            // Handle duplicate user
            System.out.println("User with name " + user.getName() + " already exists.");
        }
    }

    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public boolean isUserExists(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
