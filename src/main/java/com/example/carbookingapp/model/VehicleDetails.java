package com.example.carbookingapp.model;

public class VehicleDetails {
    private String vehicleName;
    private String vehicleNumber;

    public VehicleDetails(String vehicleName, String vehicleNumber) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }


}