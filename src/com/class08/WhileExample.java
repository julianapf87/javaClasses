package com.class08;

import java.util.Scanner;

public class WhileExample {
	/*
	 * Ask user to enter if it is raining or not (T or F)
	 * As long as there is rain let's tell user to take an umbrella 
	 * As soon as there is no rain --> u can go
	 * to the park
	 */
	public static void main(String[] args) {
		Scanner scan;
		boolean isRain;
		
		scan = new Scanner (System.in);
		
		do {
			System.out.println("Is it raining");
			isRain = scan.nextBoolean();
			
		} while (isRain);
			System.out.println("Go to the park");

	}

}
