package com.class27;

public class AnimalTest {
	public static void main(String[] args) {
		//we wont be able to override the static method
		Animal animal = new Monkey(); // runtime polymorphimsim
		animal.whoAmI();
	}
}