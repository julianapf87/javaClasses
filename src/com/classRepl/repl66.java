package com.classRepl;

public class repl66 {

	public static void main(String[] args) {
		/*
		 * For you to do: Write a program that prints the count down from 10 up to 1 and
		 * string "Happy New Year!".
		 * 
		 * 
		 * Output: 10 9 8 7 6 5 4 3 2 1 Happy New Year!
		 */

		int i = 0;

		for (i = 10; i >= 1; i--) {
			System.out.println(i);
			if (i==1) {
				System.out.println("Happy New Year!");
			}
		
		}

	}

}
