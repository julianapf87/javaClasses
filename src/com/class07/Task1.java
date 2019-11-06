package com.class07;

public class Task1 {
	/*
	 * 1. Create a boolean variable workDay and assign true 2. Create int variable
	 * day and assign it to 1 3. As long as it is a workDay print "I need a day off
	 * 4. Once day is 6 print "I do not need a day off anymore"
	 */
	public static void main(String[] args) {
		boolean workDay = true;
		int day = 1;

		while (day < 7) {
			if (day == 6 || day == 7) {
				System.out.println("I do not need a day off anymore ");
				workDay = false;
			}
			System.out.println("I need a day off");
			day++;
		}

		/*
		 * boolean workDay = true; 
		 * int day = 1;
		 * 
		 * if (day ==6) {
		 * 	workDay = false;
		 * 		System.out.println("I do not need a day off anymore");
		 * }else{
		 * 		System.out.println("I need a day off ");
		 * }
		 * day++;
		 * 
		 */

	}

}
