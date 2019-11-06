package com.classRepl;

import java.util.Scanner;

public class repl97 {

	public static void main(String[] args) {

		/*
		 * Using Scanner class input string value. Print out the following:
		 * "The first 3 letters of ___ is ___"
		 * 
		 * For example, if the input is "banana", your output should be:
		 * "The first 3 letters of banana is ban".
		 */
		
		Scanner scan = new Scanner (System.in);
		
		String word = scan.nextLine();
		
		System.out.println("The first 3 letters of " + word + " is "+ word.substring(0, 3));

	}

}
