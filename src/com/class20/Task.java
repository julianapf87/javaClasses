package com.class20;

public class Task {
	/*
	 * Create a method that will take 1 parameter as a String and return reversed
	 * String. Method should be visibly only within same package
	 */

	String str(String word) {

		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}

	/*
	 * Create a method that will take a String and return whether String is
	 * palindrome or not. Method should be available to all classes within your
	 * projects.
	 */

	boolean isPalindrome (String word1) {
		String rev = "";
		
		for (int i = word1.length()-1; i>=0; i--) {
			rev = rev + word1.charAt(i);
		}		
		
		boolean result = false;
		if (word1.equalsIgnoreCase(rev)) {
			result = true;
		}else {
			result = false;
		}
		
		return result; 
	}
	
	/*
	 * Create a method that will take a string and return an array of words from
	 * that string. Method should be available only within same class.
	 * :+1::skin-tone-4: 1
	 * 
	 */
	
	private String [] arrayofWords (String sentence) {
		String [] StringArray;
		StringArray = sentence.split(" ");
		return StringArray;
	}
	
	public static void main(String[] args) {
		
		Task task1 = new Task ();
		String reversedStr = task1.str ("Hello");
		System.out.println(reversedStr);
		
		String str = "racecar";
		boolean result2 = task1.isPalindrome(str);
		System.out.println("Is \"" + str + "\" Palindrome ? " + result2);
	
		String [] strArray = task1.arrayofWords("What a beautidul day is today");
		System.out.println("The length of the array is " + strArray.length);
		for (String word : strArray) {
			System.out.print(word);
		}
	}
	
}
