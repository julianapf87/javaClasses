package com.InterviewQuestions;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*
		 * 
		 * 7. Write a java program to check whether a given number is prime or not?
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		
		boolean prime = false;
		
		for (int i = 2; i<=num/2; ++i) {
			if (num%2==0) {
				prime = true;
				break;
			}
		}
		if (!prime) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}

	}

}
