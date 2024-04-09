package com.example.carbookingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
	DataSourceAutoConfiguration.class})
public class CarBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarBookingAppApplication.class, args);
		System.out.println("hello");
	}

}
