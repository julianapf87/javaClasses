package com.class15;

import java.util.Scanner;

public class StringManipulationsTask {

	public static void main(String[] args) {
	// ask user to enter the browser
		// based on the input we say "You've selected browser is" ______
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a browser");
		String browser = scan.nextLine();
		
		switch (browser.toLowerCase()) {
		
		case "firefox":
			System.out.println("Execution be performed on " + browser);
			break;
		case "chrome":
			System.out.println("Execution be performed on " + browser);
			break;
		case "ie":
			System.out.println("Execution be performed on " + browser);
			break;
		case "safari":
			System.out.println("Execution be performed on " + browser);
			break;
		default:
			System.out.println("Please enter valid browser");
		
		}

	}

}
