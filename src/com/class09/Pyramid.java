package com.class09;

public class Pyramid {

	public static void main(String[] args) {
		/*
		 * * ** *** **** *****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("%%%%%%%%%%%%%%%%");
		for (int o = 1; o <= 5; o++) {
			for (int m = 1; m <= o; m++) {
				System.out.print(m);
			}
			System.out.println();
		}
		System.out.println("%%%%%%%%%%%%%%%%");
		for (int o = 1; o <= 9; o++) {
			for (int m = 1; m <= o; m++) {
				System.out.print(m);
			}
			System.out.println();

		}
		
		System.out.println("%%%%%%%%%%%%%%%%");
		for (int o = 9; o >= 1; o--) {
			for (int m = 1; m <= o; m++) {
				System.out.print(m);
			}
			System.out.println();
		}
		System.out.println("%%%%%%%%%%%%%%%%");
		for (int o = 9; o >= 1; o--) {
			for (int m = 9; m >= o; m--) {
				System.out.print(m);
			}
			System.out.println();
		}
	}
}
