package com.classRepl;

public class repl88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will print the sum of all elements in column with index
		 * 1 in a 2-D int array.
		 */

		int[][] a = { 
				{ -5, -2, -3, 7 }, 
				{ 1, -5, -2, 2 }, 
				{ 1, -2, 3, -4 } };

		int sum = 0;
		int col1 = 1;
		for (int row = 0; row < a.length; row++) {

			sum += a[row][col1];

		}
		System.out.println(sum);
	}

}
//int sum2 = 0;
//int row2 =2;
//
//for (int r=0; r<a[2].length; r++) {
//	sum2+= a[row2][r];
//}System.out.println(sum2);