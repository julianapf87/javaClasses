package com.class31;

/*
 * 1.	Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
 * 2.   Create 2 child classes: Circle & Square that should have an implementation of 
 *      area and perimeter calculation. 
 * 3.   Test your code
 * 
 */
public interface Shape {

	void calculateArea(double r);

	void calculatePerimeter(double num2);
}

class Circle implements Shape {

	@Override
	public void calculateArea(double r) {

		System.out.println(3.14 * r);
	}

	@Override
	public void calculatePerimeter(double num2) {

		System.out.println(2 * 3.14 * num2);

	}
}

