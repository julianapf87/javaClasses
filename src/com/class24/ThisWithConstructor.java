package com.class24;

public class ThisWithConstructor {

	ThisWithConstructor() {
		System.out.println("I am non argument constructor");
	}

	ThisWithConstructor(String str) {
		this(); // used to call current class constructor
		System.out.println("I am constructor with 1 String parameter");
	}

	ThisWithConstructor (String str, String str1 ){
		this(str);
		//this() will always MUST be a first statement
		System.out.println("I am a constructor with 2 params");
	}
	public static void main(String[] args) {

		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		System.out.println("----------------------");
		// can we execute 2 constructors when creating an Object
		// yes, we can. It can be achieved using this() keyword
		// this type of constructor calls is knows adn CONSTRUCTOR CHAINING
		
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello", "Bye");

	}

}
