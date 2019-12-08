package com.class31;

public class Parent {

	static void hello () {
		System.out.println("Hello from Superclass");
	}
}

class Child extends Parent {
	static void hello () {
		System.out.println("Hello from Subclass");
	}
}

