package com.class09;

public class Pattern {

	public static void main(String[] args) {
		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= 5; l++) {
				System.out.print("*");
			}
		}
		System.out.println();
		// *****
		// *****
		// *****
		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
		}
		System.out.println();
		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
		}
		System.out.println();
		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$");

		for (int a = 1; a < 5; a++) {
			for (int j = 1; j < 6; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%%%%");

		for (int b = 0; b < 5; b++) {
			for (int y = 0; y < 7; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%");
		/*
		 * 12345 12345 12345 12345 12345
		 */
		for (int n = 0; n < 5; n++) {
			for (int c = 1; c < 6; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("##############");
		/*
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		for (int n = 1; n <=5 ; n++) {
			for (int c = 1; c <=5; c++) {
				System.out.print(n);
			}
			System.out.println();
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		/*
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 * 
		 */
		for (int n = 1; n <=5 ; n++) {
			for (int c = 1; c <=9; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		/*
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 * 
		 */
		
		for ( int d = 0; d<6; d++) {
			for (int v = 5; v>0; v-- ) {
				System.out.print(v);
			}System.out.println();
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		/*
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 * 
		 */
		
		for ( int d = 5; d>=1; d--) {
			for (int v = 5; v>0; v-- ) {
				System.out.print(d);
			}System.out.println();
		}
	
	}
	
	
}