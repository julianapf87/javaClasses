package com.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Print number from 1 to 50 except those that are divisible by 3
		 */

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		/*
		 * Create a program that will be asking user to apply for a credit card 10 times.
		 * As soon as you get a yes from the user, program should stop asking
		 */
		System.out.println();
		Scanner scan;
		String cc;
		
		Scanner scanner = scan= new Scanner (System.in);
		
		for (int a = 1; a<=10; a++) {
			System.out.println("Do you want to apply for a credit card");
			cc = scan.nextLine();
			
			if (cc.equals("yes")) {
				break;				
			}
		}
		
	
	
	
	
	
	}
}
