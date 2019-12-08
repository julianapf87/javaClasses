package com.class30;

public interface Drivable {
	// interface is a collection of public static final variables. 
	boolean DRIVE_FAST = true; // constant variables are written using uppercase	
	
	// by default compiler will add public abstract to the methods
	void drive();
}

class Cars {
	
	public void stop () {
		System.out.println("Car strops by pressing breaks");
	}
}
class Toyota  extends Cars implements Drivable{
	@Override
	public void drive() {
		System.out.println("Toyota can drive");
		
	}
}