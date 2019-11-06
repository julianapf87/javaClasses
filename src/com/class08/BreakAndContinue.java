package com.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break keyword breaks / exits the loop
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop ");

		// continue - it will skip CURRENT iteration

		for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		// I want to print number from 1 to 20 except 5, 6, and 7

		for (int i = 1; i < 20; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}
	}

}
