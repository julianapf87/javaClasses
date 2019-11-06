package com.class05;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		int day = 23;

		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		
		System.out.println("********************************");
		
		Scanner h = new Scanner (System.in);
		
		System.out.println("Please enter your height in inches");
		
		int height = h.nextInt();
		
		if (height <5) {
			System.out.println("Short");
		}else if (height ==5 || height == 6) {
			System.out.println("Medium");
		}else if (height == 6 || height > 6) {
			System.out.println("Tall");
		}
		
	}
}
