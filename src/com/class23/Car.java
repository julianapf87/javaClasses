package com.class23;

public class Car {

	/*
	 * Want to build make toyota cars that will have different models and colors
	 */

	static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetails() {
		System.out.println(" I build " + color + " "+ make + " " + model );
		System.out.println("My car has " + doors + " and can have a spedd up to " + speed);
	}
	

}
