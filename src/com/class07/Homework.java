package com.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// Task2 find the largest number using nested if

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 different numbers");

		double no1 = scan.nextDouble();
		double no2 = scan.nextDouble();
		double no3 = scan.nextDouble();
		if (no1 != no2 || no2 != no3) {

			if (no1 > no3) { // no1>no2 && no1>no3
				System.out.println("Largest number is fist - " + no2);
			} else { // no1>no2 but no1<no3
				System.out.println("Largest number is third -" + no3);
			}
		} else { // assuming no>no1
			if (no2 > no3) { // no2>no1 && no2>no3 --> no2=largest
				System.out.println("Largest number is second -" + no2);
			} else { // no2>no1 but no2<no3
				System.out.println("Lagerst number is third - " + no3);
			}
		}
	}
}
