package com.example.carbookingapp.model;

public class BookRide {
    private String username;
    private String driverName;

    public BookRide(String username, String driverName) {
        this.username = username;
        this.driverName = driverName;
    }

    public String getUsername() {
        return username;
    }

    public String getDriverName() {
        return driverName;
    }
}
