package com.class18;

import java.util.Scanner;

public class Task1 {

		/*
		 * Create a method that will take 2 parameters as a numbers and prints which number is larger.
		 */
		
		void isLarge (int firstNumber, int secondNumber) {
						
			if (firstNumber > secondNumber) {
				System.out.println("This number is large");
			}else if (firstNumber < secondNumber){
				System.out.println("This is smaller ");
			}else {
				System.out.println("Numbers are equal");
			}
			
			
		}
		
		
		/*
		 * * Create a method that will take a number and prints whether the number is even or odd.
		 */
		
		void evenOrOdd (int num) {
			
			if (num%2 == 0) {
				System.out.println("This number is even");
			}else {
				System.out.println("This number is odd");
			}
			
		}
		 
		/*
		 *  * Create a method that will print whether given String is palindrome or not.
		 */
		
		void palindrome (String word) {
			
			
			String reverse = "";
			
			for ( int i = word.length()-1; i>=0; i--) {
				reverse += word.charAt(i);
			} if (reverse.equals(word)) {
				System.out.println("This word is palindrome");
			}else {
				System.out.println("This is not a palindrome word");
			}
			
		}
		
		
		public static void main (String [] args) {
			
			Task1 task = new Task1();
			task.isLarge(4, 79);
			task.evenOrOdd(76);
			task.palindrome("radar");//argument
			
		}

	}
