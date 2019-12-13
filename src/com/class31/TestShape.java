package com.class31;

public class TestShape {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.calculateArea(1);
		shape.calculatePerimeter(10);
		
		Shape square = new Square();
		square.calculateArea(3);
		square.calculatePerimeter(2);
	}

}
