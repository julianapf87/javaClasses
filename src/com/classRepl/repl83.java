package com.classRepl;

public class repl83 {

	public static void main(String[] args) {
		// Write a program to print the sum of the elements in the third row.

		int[][] a = { 
				{ 5, 2, 3, 7 },
				{ 1, 5, 2, 2 },
				{ 1, 2, 3, 4 } };

		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int b = 0; b< a[i].length; b++) {
				sum += a[i][b];
			}
		}
		System.out.println("Sum in all rows is " + sum);
		
		sum = 0; 
		int row =2;
		for (int b = 0; b < a[row].length; b++) {
			sum+= a[row][b];
		}
		System.out.println(sum);
	}

}

//int[][] b = { 
//{ 2, 3, 5 }, 
//{ 2, 4, 7 }, 
//{ 8, 1, 9 },
//{ 3, 5, 1 } };
//int sum = 0;
//
//for (int i = 0; i < b.length; i++) {
//	for (int k = 0; k < b[i].length; k++) {
//		sum += b[i][k];
//	}
//}
//System.out.println("sum in all rows is " + sum);
//
//sum = 0;
//int row = 1;
//for (int k = 0; k < b[row].length; k++) {
//	sum += b[row][k];
//}
//
//System.out.println("sum in row " + row + " is " + sum);
////Homework
////Create a 1-D array
////enter the sum of each row into one element of the array
//
////Extra (work) create a 1-D array
////enter the sum of each column into one element of the array
//
