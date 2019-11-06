package com.class07;

public class doLoop {

	public static void main(String[] args) {

		// Mostly used
		int num = 10;
		while (num <= 7) {
			System.out.println("Hello");
			num++;
		}
		int num1 = 10;
		do {
			System.out.println("Bye");
			num1++;

		} while (num1 <= 7);

		System.out.println("^^^^^^^^^^");

		/*
		 * Print even numbers from 20 to 50 using do while
		 */

		// ************
		int a = 20;
		do {
			System.out.println(a);
			a += 2;
		} while (a <= 50);

		// ************
		int b = 20;
		do {
			if (b % 2 == 0) {
				System.out.println(b);
			}
			b++;
		} while (b <= 50);
	}
}
