package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your class day: :");
		String day = scan.nextLine();
		// String day1 = day.toLowerCase();

		if (day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your Java Class");

		} else if (day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is your Git Class");

		} else if (day.toUpperCase().equals("Tuesday")) {
			System.out.println("Tuesday is your SDLC class");

		} else if (day.toLowerCase().equals("Thursday")) {
			System.out.println("Thursday is your Manual Testing Class");

		} else {
			System.out.println("Invalid Entry!! Please enter a valid entry");
		}
	}

}
