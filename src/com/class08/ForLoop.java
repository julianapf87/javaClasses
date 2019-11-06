package com.class08;

public class ForLoop {

	public static void main(String[] args) {
		// Say good morning 5 times
		// initialize test condition increment

		int num = 1;
		for (int i = 0; i <= 4; i++) {
			System.out.println("good morning");
		}
		// Print numbers form 1 to 20
		for (int a = 1; a<= 10; a++) {
			System.out.println(a);
		}

		// print numbers from 10 - 1
		for (int p = 10; p >= 1; p--) {
			System.out.println(p);
		}

		for (int i = 0; i <= 50; i += 5) {
			System.out.println(i);
		}
	}

}
