package com.InterviewQuestions;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*
		 * 6. Write a Java Program to find whether a String is palindrome or not?
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a palindrome word");
		String str = scan.nextLine();
		
		String reverse = "";
		
		for (int i = str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
			
			
		}if (reverse.equals(str)) {
			System.out.println("This word is a palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
	}

}
