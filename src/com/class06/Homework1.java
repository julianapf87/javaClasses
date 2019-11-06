package com.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		double num1, num2, num3;
		num1 = 7.0;
		num2 = 4.5;
		num3 = 8.5;
		String ph;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter PH value of water");
		double value = scan.nextDouble();

		if (value == num1) {
			ph = "the PH is neutral";
		} else if (value == num2 || value < num1) {
			ph = "the PH is basic";
		} else if (value > num1 || value == num3) {
			ph = "the PH is acidic";
		} else {
			ph = "Invalid";
		}
		System.out.println("The value entered indicates that " + ph);
	}

}
