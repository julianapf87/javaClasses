package com.class08;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a code to find the sum of even and odd numbers from range 1 to 20 sum
		 * for odd nums = ... sum for even nums = ...
		 */

		System.out.println("*****************************");
		int sumEven1 = 0;
		int sumOdd1 = 0;
		for (int c = 1; c <= 20; c++) {
			if (c % 2 == 0) {
				sumEven1 = sumEven1 + c;
			} else {
				sumOdd1 = sumOdd1 + c;
			}
		}
		System.out.println("The total of all even #s is " + sumEven1);
		System.out.println("The total of all odd #s is " + sumOdd1);
	}

}