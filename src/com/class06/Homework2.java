package com.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade
		 * then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, 
		 * any other grade --> Not Acceptable. 
		 * At the end your program
		 * should print which grade was entered by a user with explanation.
		 */
		
		String grade;
		Scanner scan;
		
		scan = new Scanner (System.in);
		System.out.println("Please enter your test score");
		double score = scan.nextDouble();
		
		if (score >=90) {
			grade = "A - Excellent";
		}else if (score >=80 && score <90) {
			grade = "B - Good";
		}else if (score >=70 && score <80) {
			grade = "C - Average";
		}else if ( score >= 60 && score <70) {
			grade = "D - Bad";
		}else {
			grade = "Unacceptable";
		}
		
		System.out.println("The test score you got is " + grade);
		
		
		
		
	}

}
