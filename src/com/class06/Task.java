package com.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan;
		String season;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter the month you were born");
		String season1 = scan1.nextLine();
		
		if (season1.equals("January") || season1.equals("February") || season1.equals("December")) {
			season = "Winter";
		} else if (season1.equals("March") || season1.equals("April") || season1.equals("May")) {
			season = "Spring";
		} else if (season1.equals("June") || season1.equals("July") || season1.equals("August")) {
			season = "Summer";
		} else if (season1.equals("September") || season1.equals("October") || season1.equals("November")) {
			season = "Fall";
		} else {
			season = " Unknown";
		}
		
		System.out.println(" You were born in "+ season);
		System.out.println(season1);
	}
}
