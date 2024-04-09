package com.example.carbookingapp.model;

public class DriverDetails {
    private String name;
    private String gender;
    private int age;

    public DriverDetails(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

