package com.example.carbookingapp.service;

import com.example.carbookingapp.model.BookRide;
import com.example.carbookingapp.model.Driver;
import com.example.carbookingapp.model.RideRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface BookingService {
    List<Driver> findRide(RideRequestDto rideRequestDto);

    String chooseRide(String username, String driverName);

}
