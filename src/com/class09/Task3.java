package com.class09;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found they system should display "Congratulations!! You got it!"
		 */

		Scanner scan;
		int secretNum, guessNum;

		scan = new Scanner(System.in);
		secretNum = 12;

		do {
			System.out.println("Please guess a number between 1 and 20");
			guessNum = scan.nextInt();
			if (guessNum < secretNum) {
				System.out.println("Your number is too small");
			} else {
				System.out.println("Your number is too large");
			}

		} while (guessNum != secretNum);
		System.out.println("Congratulations you got it!!");

	}

}
