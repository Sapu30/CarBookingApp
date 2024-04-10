package com.example.carbookingapp.dto;

public class BookRideDto {
    private String username;
    private String driverName;

    public BookRideDto(String username, String driverName) {
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
