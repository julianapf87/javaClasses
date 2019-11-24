package com.class15;

public class One {

	public static void main(String[] args) {
		// String class comes in java lang package
		
		// 2 ways to create a string
		// first wasy : using String Literal
		
		String str = "Hello";
		
		//Second way using new keyboard. Creating a string object
		
		String str1 = new String ("Hello");
		System.out.println(str);
		System.out.println(str1);
		
		//find the number of characters inside the string
		int length = str.length();
		System.out.println(length);
		
		// case conversion methods/functions
		System.out.println(str.toLowerCase()); //hello
		System.out.println(str); // Hello
		
		//Verify is there is the String empty
		String myString = ""; // empty value
		boolean isEmpty = myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1 = null; //no value at all it is equal to 
		
		
		
		// how to verify existence of characters in the String
		String a = "Good evening students";
		System.out.println(a.contains("students"));
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("students"));
	}

}
