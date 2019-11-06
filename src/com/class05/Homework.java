package com.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner cc = new Scanner(System.in);

		System.out.println("Do you have a credit card? True or false");

		boolean cc1 = cc.nextBoolean();

		if (cc1) {
			System.out.println("What is the balance on your card");
			int balance = cc.nextInt();

			if (balance >= 1000) {
				System.out.println("Please pay off your balance");
			} else {
				System.out.println("You can spend more money");
			}
		} else {
			System.out.println("Would you like to apply for a credit card?");
		}

	}

}
