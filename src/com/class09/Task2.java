package com.class09;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integer (start and end point), provided
		 * by an user and then from that range prints the sum and of the even and odd
		 * integers
		 */
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter numbers that you want to start with");
		int num1 = num.nextInt();
		System.out.println("Please enter the end point");
		int num2 = num.nextInt();

		int sumOdd = 0;
		int sumEven = 0;

		for (int a = num1; a <= num2; a++) {
			if (a % 2 == 0) {
				sumEven = sumEven + a;
			} else {
				sumOdd = sumOdd + a;
			}
		}
		System.out.println(" Sum of even numbers is " + sumEven);
		System.out.println("Sum of odd numbers is " + sumOdd);

//		package com.class10;
//		​
//		import java.util.Scanner;
//		​
//		public class HW3AnotherWay {
//		​
//			public static void main(String[] args) {
//				
//				Scanner scan = new Scanner(System.in);
//				System.out.println("Enter start number");
//				int start = scan.nextInt();
//				System.out.println("Enter end number");
//				int end = scan.nextInt();
//		​
//				int even = 0;
//				int odd = 0;
//		​
//				if (start < end) {
//					for (int i = start; i <= end; i++) {
//						if (i % 2 == 0) {
//							even = even + i;
//						} else {
//							odd = odd + i;
//						}
//					}
//					System.out.println("The sum of even numbers is " + even);
//					System.out.println("The sum of odd numbers is " + odd);
//					
//				} else {//if 1num >2 num 
//					System.out.println("Please enter start# less then end number");
//				}
				
		
	}

}
