package com.class29;

public class Recap_Super {
}

class Parent{
	
	String str = "Hello";
	int age;
	public Parent (int age) {
		this.age = age;
	}
}

class Child extends Parent {

	public Child(int age) {
		super(age);
	}
	
	
}