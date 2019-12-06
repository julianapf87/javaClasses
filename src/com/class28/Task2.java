package com.class28;
/*
 *  * Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 
 *  In circle class create a method to calculate the area of circle. 
 *  Test your code
 */

public class Task2 {

	public static void main(String[] args) {

	 Circle obj = new Circle(40);
	 obj.areaCircle();
	}
}

class Shape {
	int radius;

	Shape(int radius) {
		this.radius = radius;
	}
}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	public void areaCircle() {
		double area = 3.14 * radius;
		System.out.println("The area of the circle is " + area);
	}
}
