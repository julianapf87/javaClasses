package com.class19;

public class Tasks {

	/*
	 * 1.Create a method createEmail(). Based on provided users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * johnsnow@gmail.com or johnsnow@yahoo.com*
	 */

	String createEmail(String userName, String lastName, String emailtype) {

		return userName + lastName + "@" + emailtype + ".com";
	}

	// 2. Write a method to return whether given number is prime or not?
	boolean isPrime(int num) {

		boolean isPrime1 = false;

		if (num != 0 || num != 1) {
			isPrime1 = false;

		} else {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					isPrime1 = false;
					break;
				}
			}
		}
		return isPrime1;
	}

	/*
	 * * 3. Create class Student that will have a method getGrade. Your method
	 * should accept the score of a student and return a grade: score > 90 - A score
	 * >80 - B score >70 - C score > 50 - D anything else - F
	 */
	String Student(int score) {
		String grade;

		switch (score) {

		case 90:
			grade = "A";
			break;
		case 80:
			grade = "B";
			break;
		case 70:
			grade = "C";
			break;
		case 60:
			grade = "D";
			break;
		case 50:
			grade = "F";
			break;
		default:
			grade = "unknown";
		}
		return grade;
	}

	public static void main(String[] args) {

		Tasks obj = new Tasks();
		
		String email = obj.createEmail("juli", "parra", "gmail");
		System.out.println(email);
		
		
		boolean prime = obj.isPrime(1);
		if (prime) {
			System.out.println("This is a prime number");
		} else {
			System.out.println("This is not a prime number");
		}
		
		String finalGrade = obj.Student(80);
		System.out.println(finalGrade);

	}
}
