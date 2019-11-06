package com.classRepl;

import java.util.Scanner;

public class repl35 {

	public static void main(String[] args) {
		/*
		 * For you to do: Create a program that prompt user with question:
		 * "Do you need a loan?" If the result is true then prompt user with question:
		 * "What is your credit score?". Otherwise eligibility is "Unknown" Based on the
		 * score define users eligibility: if score is below 600 --> eligibility =
		 * "Not eligible" if score is between 600 and 700 inclusive --> eligibility =
		 * "Maybe eligible" if score is between 701 and 800 inclusive --> eligibility =
		 * "Eligible" if score is higher than any other previous values --> eligibility
		 * = "Definitely eligible" .
		 * 
		 * Output: "The eligibility is ____"
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Do you need a loan? True or False");
		
		boolean loan =  scan.nextBoolean();
		String eligibility = null;
		
		if (loan) {
			System.out.println("What is your credit score?");
			int score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not eligibile";
			}else if (score > 600 && score <=700) {
				eligibility = "Maybe eligibile";
			}else if (score>701 && score <800) {
				eligibility = "Eligibile";
			}else if (score >=801) {
				eligibility = "Definitely eligibile";
			}
		}else {
			eligibility = "Unknown";
		}
		
			System.out.println("The eligibility is "+ eligibility);
	}

}
