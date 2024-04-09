package com.example.carbookingapp.model;

public class Driver {

    private DriverDetails driverDetails;
    private VehicleDetails vehicleDetails;
    private double[] currentLocation;


    public Driver() {}

    public Driver(DriverDetails driverDetails, VehicleDetails vehicleDetails, double[] currentLocation) {
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

    public double[] getCurrentLocation() {
        return currentLocation;
    }

}
