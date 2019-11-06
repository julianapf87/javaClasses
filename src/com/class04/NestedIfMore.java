package com.class04;

public class NestedIfMore {

	public static void main(String[] args) {
		/*
		 * Check age, if age is less than 16 --> you are to young to drive otherwise-->
		 * you are elegible to drive & we will check if you are older than 18 --> you
		 * can get driver's license and if not you can get driver permit
		 */

		int age = 55;

		if (age < 16) {
			System.out.println("You are too young to drive");
		} else {
			System.out.println("You are elegible to drive");

			if (age >= 18) {
				System.out.println("You can get drive alone");
			} else {
				System.out.println("You need your parents to drive");
			}
		}
		System.out.println("#####################");
		/*
		 * We need to check if student completed the quiz if yes : Good job If not : Not
		 * good If completed we will check store If more than 90 = u got an A If more
		 * than 80 = u got a B anything else you should study more
		 */

		boolean quiz = true;
		int score = 77;

		if (quiz) {
			System.out.println("Good Job");
			
			if (score>=90) {
				System.out.println("You got an A");
			} else if (score>=80) {
				System.out.println("You got a B");
			} else {
				System.out.println("You should study more");
			}
			
		} else {
			System.out.println("Not good");
		}

	}

}
