package com.class12;

public class StringMiniPulationDemo {

	public static void main(String[] args) {

		// There are two ways to create string objects
		// 1. String Literal

		String name = "John";
		System.out.println(name);
		System.out.println(name.length());

		// 2. Creating string with new key word
		String name1 = new String("John1");

		/*
		 * This method returns the length of this string. The length is equal to the
		 * number of 16 bit unicode characters in the string
		 */

		int name1Len = name.length();
		System.out.println(" The lenght of name1Len is = " + name1Len);

		// .toLowerCase();
		String str1 = " Hello World";
		System.out.println("Before :" + str1);
		String newValueOfStr1 = str1.toLowerCase();
		System.out.println("After :  " + newValueOfStr1);

		// .equals() ;  this method will count everything such as capitalization and content
		System.out.println("+++++++++++");
		String str2 = " HellO World";
		boolean isEqual = str1.equals(str2);
		System.out.println(isEqual);
		System.out.println("+++++++++++");
		// .equalsIgnoreCase(); This method does not care for capitalization and compare the content only
		System.out.println(str1.equalsIgnoreCase(str2));

		// .toUpperCase (); This method converts all of the characters in this String to uppercase
		String str3 = "Mohammad";
		
		System.out.println(str3.toUpperCase());
		
		
		

	}

}
