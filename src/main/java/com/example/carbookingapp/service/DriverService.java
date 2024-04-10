package com.example.carbookingapp.service;

import com.example.carbookingapp.model.Driver;
import com.example.carbookingapp.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface DriverService {

    public void addDriver(Driver driver);

    public List<Driver> getAllDrivers();

    public Driver getDriverByName(String name);

    public boolean isDriverExists(String name);

}