package com.example.carbookingapp.model;

public class Driver {
    private String name;
    private String gender;
    private int age;
    private String vehicleDetails;
    private String registrationNumber;
    private double locationX;
    private double locationY;
    private boolean available;

    public Driver() {}

    public Driver(String name, String gender, int age, String vehicleDetails, String registrationNumber,
                  double locationX, double locationY) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.vehicleDetails = vehicleDetails;
        this.registrationNumber = registrationNumber;
        this.locationX = locationX;
        this.locationY = locationY;
        this.available = true;
    }
}
