package com.classRepl;

import java.util.Scanner;

public class repl43 {
	/*
	 * Prompt user with questions: "Please enter your favorite car make"
	 * 
	 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
	 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
	 * "italian car" anything else besides those values --> carOrigin = "unknown"
	 * 
	 * The output of your program should be: "Your favorite car is ___"
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your favorite car");

		String car = scan.nextLine();

		String carOrigin;

		switch (car) {
		case "BMW":
			carOrigin = "a german car";
			break;
		case " Toyota":
			carOrigin = "a japanese car";
			break;
		case "Maserati":
			carOrigin = "an italian car";
			break;

		default:
			carOrigin = "an Unknown";
		}
		System.out.println("Your favorite car is " + carOrigin);

	}
}
