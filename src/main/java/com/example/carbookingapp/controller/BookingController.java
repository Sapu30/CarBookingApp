package com.example.carbookingapp.controller;

import com.example.carbookingapp.Dtos.BookRideDto;
import com.example.carbookingapp.model.Driver;
import com.example.carbookingapp.Dtos.RideRequestDto;
import com.example.carbookingapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/find")
    public ResponseEntity<List<Driver>> findRide(@RequestBody RideRequestDto rideRequest) {
        List<Driver> matchingRides = bookingService.findRide(rideRequest);
        if (matchingRides.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(matchingRides);
    }

    @PostMapping("/choose")
    public ResponseEntity<?> chooseRide(@RequestBody BookRideDto bookRide) {
        String chosenRide = bookingService.chooseRide(bookRide.getUsername(), bookRide.getDriverName());
        if (chosenRide != null) {
            return ResponseEntity.ok("Ride chosen for user " + bookRide.getUsername() + " with driver " + bookRide.getDriverName());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No ride found with driver name " + bookRide.getDriverName());
        }
    }


}