package com.example.carbookingapp.serviceImpl;

import com.example.carbookingapp.Dtos.RideRequestDto;
import com.example.carbookingapp.model.*;
import com.example.carbookingapp.service.BookingService;
import com.example.carbookingapp.service.DriverService;
import com.example.carbookingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private UserService userService;

    @Autowired
    private DriverService driverService;

    private List<Driver> availableDrivers;

    public BookingServiceImpl() {
        availableDrivers = new ArrayList<>();
        // Add some sample drivers
        DriverDetails d1 = new DriverDetails("Driver1", "M", 22);
        VehicleDetails v1 = new VehicleDetails("Swift", "KA-01-12345");
        String l1 = "10,1";
        availableDrivers.add(new Driver(d1, v1, l1));

        DriverDetails d2 = new DriverDetails("Driver2", "M", 29);
        VehicleDetails v2 = new VehicleDetails("Swift", "KA-01-12345");
        String l2 = "10,10";
        availableDrivers.add(new Driver(d2, v2, l2));

        DriverDetails d3 = new DriverDetails("Driver3", "M", 24);
        VehicleDetails v3 = new VehicleDetails("Swift", "KA-01-12345");
        String l3 = "5,3";
        availableDrivers.add(new Driver(d3, v3, l3));
    }


    private final double POSSIBLEDISTANCE = 5.0;

    @Override
    public List<Driver> findRide(RideRequestDto rideRequest) {

        List<Driver> matchingRides = new ArrayList<>();
        boolean anyDriverWithin5Units = false;
        for (Driver driver : availableDrivers) {
            if (driver.isAvailable()) {
                double distance = calculateDistance(driver.getCurrentLocation(), rideRequest.getSource());
                if (distance <= POSSIBLEDISTANCE) {
                    matchingRides.add(driver);
                    anyDriverWithin5Units = true;
                }
            }
        }

        if (!anyDriverWithin5Units) {
            System.out.println("No ride found");
        }

        return matchingRides;
    }


    public double calculateDistance(String location1, String location2) {
        String[] driverCord = location1.split(",");
        String[] userCord = location2.split(",");

        double dx = Double.parseDouble(driverCord[0]) - Double.parseDouble(userCord[0]);
        double dy = Double.parseDouble(driverCord[1]) - Double.parseDouble(userCord[1]);
        double distanceSquared = Math.pow(dx, 2) + Math.pow(dy, 2);

        return Math.sqrt(distanceSquared);

    }

    @Override
    public String chooseRide(String username, String driverName) {

        Driver candidateDriver = availableDrivers.stream().filter(driver -> driver.getDriverDetails().getName().equals(driverName)).findAny().orElse(null);

        if (Objects.nonNull(candidateDriver)) {

            if (candidateDriver.isAvailable()) {

                candidateDriver.setAvailable(false);
                return candidateDriver.getDriverDetails().getName() + "[Available]";

            } else {
                return "Driver Booked Already, Please find Another";
            }
        }
        return "Error Occured while Booking Driver";
    }

}
