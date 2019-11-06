package com.InterviewQuestions;

public class Question1 {

	public static void main(String[] args) {

		/*
		 * 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable?
		 */

		int a = 12;
		int b = 20;
		
		System.out.println("Before swap");
		System.out.println("a value: " +a);
		System.out.println("b value: " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap");
		System.out.println("a value: " +a);
		System.out.println("b value: " +b);
		
		/*
		 * Swap 2 strings without a temporary variable
		 */
		
		String c = "Today is rainy";
		String d = "I should wear rain boots";
		
		System.out.println("Strings before swaping: c = " + c + " and d = " + d);
		
		c = c + d;
		d = c.substring(0,c.length()-d.length());
		c = c.substring(d.length());
		
		System.out.println("Strings before swaping: c = " + c + " and d = " + d);
	}

}
