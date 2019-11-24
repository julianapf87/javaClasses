package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		/*
		 * Declare a string and if String has more than 10 characters -> String is large
		 * Otherwise -> String is small
		 */

		String str = "Welcome home";

		int numofChars = str.length();

		if (numofChars >= 10) {
			System.out.println("String is large");
		} else {
			System.out.println("String is small");

		}

		char character = str.charAt(4);
		System.out.println(character);

		// Create an object of the class where mehtod is defined

		Recap obj = new Recap();
		// obj.sum(10, 30); -> we will get a compile error saying change return type
		obj.sum(10, 20);

		MethodWithReturnValue obj1 = new MethodWithReturnValue();
		int sum = obj1.sum(50, 50);
		System.out.println(sum);
		int largest = obj1.findLargest(20, 40);
		System.out.println(largest);
	}

	// Return type, method name (list of parameters)
	int sum(int num1, int num2) {
		int c = num1 + num2;
		return c;
	}

	// method to find largest number

	int findLargest(int num1, int num2) {
		int largest;
		if (num1>num2) {
			largest = num1; 
		}else {
			largest = num2;
		}
		return largest;
	}
	
	
}

















