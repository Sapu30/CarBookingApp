package com.example.carbookingapp.model;

public class RideRequestDto {
    private String username;
    private String source;
    private String destination;

    public RideRequestDto(String username, String source, String destination) {
        this.username = username;
        this.source = source;
        this.destination = destination;
    }

    public String getUsername() {
        return username;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

}
