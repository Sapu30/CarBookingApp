package com.example.carbookingapp.service;

import com.example.carbookingapp.model.Driver;
import com.example.carbookingapp.Dtos.RideRequestDto;

import java.util.List;


public interface BookingService {
    List<Driver> findRide(RideRequestDto rideRequestDto);

    String chooseRide(String username, String driverName);

}
