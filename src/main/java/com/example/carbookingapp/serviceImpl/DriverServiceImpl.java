package com.example.carbookingapp.serviceImpl;

import com.example.carbookingapp.model.Driver;
import com.example.carbookingapp.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        if (!isDriverExists(driver.getDriverDetails().getName())) {
            drivers.add(driver);
        } else {
            // Handle duplicate driver
            System.out.println("Driver with name " + driver.getDriverDetails().getName() + " already exists.");
        }
    }

    public List<Driver> getAllDrivers() {
        return new ArrayList<>(drivers);
    }

    public Driver getDriverByName(String name) {
        for (Driver driver : drivers) {
            if (driver.getDriverDetails().getName().equals(name)) {
                return driver;
            }
        }
        return null;
    }

    public boolean isDriverExists(String name) {
        for (Driver driver : drivers) {
            if (driver.getDriverDetails().getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
