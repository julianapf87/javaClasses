package com.class14;

public class task1 {

	public static void main(String[] args) {
		/*
		 * Create a string that will hold a sentence. Write a program to get a new
		 * string without any spaces.
		 * 
		 */

		String a = "Today is a rainy day";

		System.out.println(a.replace(" ", ""));
		System.out.println();
		System.out.println("Second Task");
		System.out.println();

		/*
		 * Create a string that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in a string.
		 * 
		 */

		String b = "!@123Hello345%$my@#$234dear";

		System.out.println(b.length());
		System.out.println();
		System.out.println("Third task");
		System.out.println();

		/*
		 * Find out how many sentences are in that string
		 */

		String c = "Is is saturday? Is it raining? Do we have a Java Class today?";

		String[] array = c.split("\\?");

		System.out.println(array.length);
	}

}
