package com.class04;

public class Task1 {
	public static void main(String[] args) {
		boolean diploma = true;
		double gpa = 3.4;

		if (diploma) {
			System.out.println("Congratulations!!!");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship");
			} else {
				System.out.println("You should have studied harder.");
			}
		} else {
			System.out.println("Get a degree");
		}
		System.out.println("***************************");

		double mortgageRate = 2.0;
		double mortgagePrice = 250000;

		if (mortgageRate >= 4.5) {
			System.out.println("You will buy a house");

			if (mortgagePrice >= 200000) {
				System.out.println("You will take a loan");
			} else {
				System.out.println("You will pay cash");
			}
		} else {
			System.out.println("You will considered buying at another time");
		}
	}
}
