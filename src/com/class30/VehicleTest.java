package com.class30;

public class VehicleTest {

	public static void main(String[] args) {

		BMW bmw = new BMW("239dfjf", "Sedan", "BMW", "X5");
		
		bmw.displayTotal();//1
		
		Vehicle.displayTotal();
		
		// come from Vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		// comes from Car class
		bmw.breaking();
		// comes from BMW
		bmw.display();

		Car car = new BMW("239dfjf", "Sedan", "BMW", "X5");
		// come from Vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();
		// comes from Car class
		car.breaking();
		// This wont be available to the parent
		// car.display();
		Vehicle vehicle = new BMW("239dfjf", "Sedan", "BMW", "X5");
		// come from Vehicle class
		vehicle.drive();
		vehicle.stop();
		vehicle.speed();
		vehicle.start();
		// Cannot access it
		//vehicle.breaking();
		// Cannot access it
		//vehicle.display();
		
		Vehicle.displayTotal();
		BMW.displayTotal();
		bmw.displayTotal();

	}
}
