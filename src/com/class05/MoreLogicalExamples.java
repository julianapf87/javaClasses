package com.class05;
// to import short cut is Ctr+Shift+O

import java.util.Scanner;

public class MoreLogicalExamples {
	public static void main(String[] args) {

		Scanner scan;
		double salesAmount;
		double commission;

		scan = new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount = scan.nextDouble();

		if (salesAmount < 100) {
			commission = salesAmount * 0.1;
		} else if (salesAmount >= 100 && salesAmount < 200) {
			commission = salesAmount * 0.2;
		} else if (salesAmount >= 200 && salesAmount < 500) {
			commission = salesAmount * 0.3;
		} else if (salesAmount >= 500) {
			commission = salesAmount * 0.5;
		} else {
			commission = 0;
		}
		System.out.println("Based on the sales your commission is " + commission);
	}
}
