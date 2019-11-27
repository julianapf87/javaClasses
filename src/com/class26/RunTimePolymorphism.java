package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.sleep();
		animal.eat();
		
		System.out.println("==========");
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		cat.sleep();
		
		
		//widening
		
		double d = 90;
		
		//narrowing
		int i = (int)1.99;
		
		//Non-primitive Typecasting
		//Widening -> creating an object of the class and giving reference to the parent class 
		System.out.println("==================");
		Animal obj = new Cat();
		obj.eat();
		obj.sleep();
		//narrowing 
		// Cat obj = new Animal (); --> cannot convert from animal to Cat
		
	}
}
