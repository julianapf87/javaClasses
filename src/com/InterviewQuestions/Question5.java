package com.InterviewQuestions;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * 5. Write a java program to reverse String? Reverse a string word by word?
		 */
		
		String a = "Small children are playing in the yard";

		for ( int i =a.length()-1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}	
	}

}
