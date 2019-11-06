package com.class05;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*
		 * Ask user to enter age
		 * if age is from 1 to 3 --> you are a baby
		 * if age from 3 to 5 --> you are toddler
		 * if age from 5 to 12 --> you are a kid
		 * if age from 12 - 19 --> you are a teenager
		 * if age >20 --> you are an adult
		 */

		Scanner age = new Scanner (System.in);
		
		System.out.println("Please enter age");
		int age1 = age.nextInt();
		
		String human;
		
		if (age1 == 1 || age1 == 2 || age1 == 3) {
			human="baby";
		}else if (age1 == 3 || age1 == 4 ||age1 == 5) {
			human = "toddler";
		}else if (age1 >= 5 && age1 <=12) {
			human = "kid";
		}else if (age1 >=12 && age1<=19) {
			human = " Adult ";
		}else {
			human = "unknown";
		}
		System.out.println("You are " + human);
	}

}
