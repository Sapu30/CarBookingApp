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

    @PostMapping("/add/driver")
    public void addDriver(@RequestBody Driver driver) {
        driverService.addDriver(driver);
    }

    @PostMapping("/addAll")
    public void addDrivers(@RequestBody List<Driver> driverList) {
        for (Driver driver : driverList) {
            driverService.addDriver(driver);
        }
    }

    @GetMapping("/driver")
    public Driver getDriver(String name) {
        return driverService.getDriverByName(name);
    }

    @GetMapping("/all")
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

//    @DeleteMapping("/delete/driver/driverName")
//    public void deleteDriver(@PathVariable String name) {
//        driverService.deleteDriver(name);
//    }

}