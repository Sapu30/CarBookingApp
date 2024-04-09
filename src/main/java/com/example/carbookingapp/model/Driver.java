package com.example.carbookingapp.model;

public class Driver {

    private DriverDetails driverDetails;
    private VehicleDetails vehicleDetails;
    private String currentLocation;

    private boolean available = true;


    public Driver() {}

    public Driver(DriverDetails driverDetails, VehicleDetails vehicleDetails, String currentLocation) {
        this.driverDetails = driverDetails;
        this.vehicleDetails = vehicleDetails;
        this.currentLocation = currentLocation;
    }

    public DriverDetails getDriverDetails() {
        return driverDetails;
    }

    public VehicleDetails getVehicleDetails() {
        return vehicleDetails;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
