package com.class25_1;

public class CanWeOverload {

	// can we overload a private methods? yes
	private void methodOne() {
		System.out.println(" I am method one");
	}
	private void methodOne (String str) {
		System.out.println("I am mehtod one with " + str);
	}
	//can we overload a main method? yes
	// Can we overload a static method? Yes
	
	public static void main(String[] args) {
		System.out.println("I am a main method with string array");
		CanWeOverload.main("String");
		String [] array = {"A", "B"};
		main ( "Hello", array);
	
	}
	public static void main(String str) {
		System.out.println("i am a main methig with String arguments");
	}
	
	public static void main(String str, String [] arg) {
		System.out.println("I am a main method with 2 parameters");
	}
}
