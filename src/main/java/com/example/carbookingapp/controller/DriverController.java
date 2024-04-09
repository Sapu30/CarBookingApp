package com.example.carbookingapp.controller;

import com.example.carbookingapp.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.carbookingapp.service.DriverService;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping("/add")
    public void addDriver(@RequestBody Driver driver) {
        driverService.addDriver(driver);
    }

    @GetMapping("/all")
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }
}