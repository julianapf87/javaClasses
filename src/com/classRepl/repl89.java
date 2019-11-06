package com.classRepl;

public class repl89 {

	public static void main(String[] args) {
		/*
		 * Write a program that sums all numbers that are on even index and on even row
		 * and prints it out.
		 * 
		 * For example, in the following array, the numbers with parentheses would be
		 * summed:
		 * 
		 */
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int sum = 0;

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a [row][col] %2==0 && row ==2) {
					sum = sum + a[row][col];
				}
			}
		}System.out.println(sum);
	}
}
