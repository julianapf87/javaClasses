package com.review4;

public class Pyramid {

	public static void main(String[] args) {
		/*
		 * 1 
		 * 12 
		 * 123 
		 * 1234
		 * 12345
		 */

		for (int row = 1; row <=6; row++) {
			for (int col1 = 1; col1 < row; col1++) {
				System.out.print( col1 * col1 + " ");
			}System.out.println();
		}

	}
}
