package com.class04;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner loan = new Scanner(System.in);

		System.out.println("Please enter the amount of loan needed");
		double loan1 = loan.nextDouble();

		if (loan1 <= 200000) {
			System.out.println("You've been approved for a loan");
		} else {
			System.out.println("You've been rejected");
		}
		
	}
}
