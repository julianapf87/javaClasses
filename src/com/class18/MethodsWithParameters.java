package com.class18;

public class MethodsWithParameters {

	void sayHello(String name) {
		System.out.println("Hello" + name);
	}

	public static void main(String[] args) {

		MethodsWithParameters obj = new MethodsWithParameters();
		obj.sayHello(" Asel");
		obj.sayHello(" Waqas");
		obj.sayHello(" Diego");
		obj.sayHelloDifferentLanguages("USA");
		obj.sayHelloDifferentLanguages("Russia");
		obj.sayHelloDifferentLanguages("Paraguay");
		obj.sayHelloDifferentLanguages("Italy");
		obj.sayHelloDifferentLanguages("France");
		obj.sayHelloDifferentLanguages("spain");
		obj.sayNameAndAge("Jack", 45);
		obj.isSnowing(true);
		obj.isSnowing(false);
	}

	/*
	 * Create a method that will say hello in different languages based on the value
	 * that will be passed when user calls a method
	 */

	void sayHelloDifferentLanguages(String country) {

		switch (country.toLowerCase()) {

		case "usa":
			System.out.println("Hello");
			break;

		case "russia":
			System.out.println("Privet");
			break;

		case "paraguay":
			System.out.println("Hola");
			break;

		case "italy":
			System.out.println("Ciao");
			break;

		case "france":
			System.out.println("Bonjour");
			break;

		case "spain":
			System.out.println("Holita");
			break;

		default:
			System.out.println("I don't know how to say hello in your language");

		}
	}

	// method to say name and age
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is " + name + " and I am " + age + "years old");
	}

	// create a method that will check if it snowing
	// if snow -> stay at home, otherwise go for a walk

	void isSnowing(boolean isSnowing) {// method name
		//method body
		if (isSnowing) {
			System.out.println("Stay at home");
		} else {
			System.out.println("Go for a walk");
		}
	}

}
