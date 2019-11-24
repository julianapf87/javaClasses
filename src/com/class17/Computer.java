package com.class17;

public class Computer {

	// define features, attributes
	String monitor, brand, name, mouse;
	boolean keyboard;
	int size, memory, screen, ram;

	// define behavior, actions

	void playGames() { // method heather
		// method body
		System.out.println("I can play on my " + name);
	}

	void javaCoding() {
	System.out.println("I can do Java coding on my " + name);
	}
	
	void watchMovie() {
		System.out.println("I can watch movie on my " + name);
	}
	
	public static void main (String []args) {
		Computer comp1 = new Computer();
		comp1.brand = "Apple";
		comp1.name = "MacBook Pro";
		comp1.memory = 250;
		
		System.out.println("I have " + comp1.brand + comp1.name);
		comp1.javaCoding();
		comp1.watchMovie();
		
		Computer comp2 = new Computer();
		comp2.brand = "DELL";
		comp2.name = "420";
		comp2.memory = 125;
		
		comp2.javaCoding();
		comp2.watchMovie();
		comp2.playGames();
	}
}
