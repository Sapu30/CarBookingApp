package com.example.carbookingapp;

import com.example.carbookingapp.Dtos.RideRequestDto;
import com.example.carbookingapp.model.*;
import com.example.carbookingapp.service.BookingService;
import com.example.carbookingapp.service.DriverService;
import com.example.carbookingapp.service.UserService;
import com.example.carbookingapp.serviceImpl.BookingServiceImpl;
import com.example.carbookingapp.serviceImpl.DriverServiceImpl;
import com.example.carbookingapp.serviceImpl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication(exclude = {
	DataSourceAutoConfiguration.class})
public class CarBookingAppApplication {

	private UserService userService;
	private DriverService driverService;
	private BookingService bookingService;
	public CarBookingAppApplication() {

		this.userService = new UserServiceImpl();
		this.driverService = new DriverServiceImpl();
		this.bookingService = new BookingServiceImpl();

	}

	public void demo() {
		// Add users
		userService.addUser(new User("Abhishek", "M", 23));
		userService.addUser(new User("Rahul", "M", 29));
		userService.addUser(new User("Nandini", "F", 22));

		// Add drivers
		DriverDetails d1 = new DriverDetails("Driver1", "M", 22);
		VehicleDetails v1 = new VehicleDetails("Swift", "KA-01-12345");
		String l1 = "10,1";
		driverService.addDriver(new Driver(d1, v1, l1));

		DriverDetails d2 = new DriverDetails("Driver2", "M", 29);
		VehicleDetails v2 = new VehicleDetails("Swift", "KA-01-12345");
		String l2 = "10,10";
		driverService.addDriver(new Driver(d2, v2, l2));

		DriverDetails d3 = new DriverDetails("Driver3", "M", 24);
		VehicleDetails v3 = new VehicleDetails("Swift", "KA-01-12345");
		String l3 = "5,3";
		driverService.addDriver(new Driver(d3, v3, l3));

		// Find available rides
		System.out.println("Available rides:");
		List<Driver> rides = bookingService.findRide(new RideRequestDto("Rahul", "10,0", "15,3"));
		for (Driver ride : rides) {
			System.out.println("Driver: " + ride.getDriverDetails().getName() + ", Vehicle: " + ride.getVehicleDetails() + ", Location: " + ride.getCurrentLocation());
		}

		// Choose a ride
		bookingService.chooseRide("Rahul", "Driver2");

	}

	public static void main(String[] args) {
		SpringApplication.run(CarBookingAppApplication.class, args);
		CarBookingAppApplication demoRunner = new CarBookingAppApplication();
		demoRunner.demo();
	}


}
