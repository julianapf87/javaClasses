package com.class17;

public class ObjectsOfCarClass {

	public static void main(String[] args) {
		// to create an object syntax is
		// ClassName variable = new ClassName ();

		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "S";
		car1.color = "black";
		car1.year = 2020;
		car1.wheels = 4;
		car1.windows = 5;
		car1.speed = 200;
		
		// accesing behavior for the 1st object
		car1.start();
		car1.accelerate();
		car1.drive();
		
		
		System.out.println("-------");
		Car car2 = new Car ();
		car2.make = "BMW";
		car2.model = "i8";
		car2.color = "Purple";
		car2.year = 2019;
		car2.wheels = 4;
		car2.windows = 6;
		car2.speed = 300;
		car2.make = "Toyota";
		// accesing behavior for the 2nd object		
		car2.start(); // calling method start from class Car
		car2.accelerate();
		car2.drive();
		

		//print features of the car
		// I have a black Tesla
		System.out.println("I have a " + car1.color + " "+  car1.make);
		System.out.println("I drive a " + car2.make + " " + car2.year);
		
		
		
	}

}
