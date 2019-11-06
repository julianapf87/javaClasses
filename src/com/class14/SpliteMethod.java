package com.class14;

public class SpliteMethod {

	public static void main(String[] args) {

		/*
		 * Split method
		 * this mehtod splits the string around the matches of the given regular expression
		 */
		
		//split the following string into array of strings / work
		String str = "Video provides a powerful way to help you prove your point";
		
		String[] array = str.split(" ");
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("================");
		// How can we find how many sentences are in the following string;
		
		String str1 = "Today is Sunday. It's a sunny day. And we are having Java class";
		
		String [] array2 = str1.split("\\.");
		System.out.println("The number of senternces in the given string is" + array2.length);

		for (String string : array2) {
			System.out.println(string.trim());
		}
		
	
	}

}
