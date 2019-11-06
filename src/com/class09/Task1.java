package com.class09;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Print: 55555 4444 333 22 1
		 */
		for (int d = 5; d >= 1; d--) {
			for (int v = 1; v <= d; v++) {
				System.out.print(d);
			}
			System.out.println();
		}
		
		/*
		 * Print:
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 */
		
		System.out.println("######################");
		
		for (int i=0; i<=5; i++) {
			for (int n=1; n<=i; n++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		for (int i=4; i>=1; i--) {
			for (int n=1; n<=i; n++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
		
	}

}
