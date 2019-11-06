package com.classRepl;

import java.util.Scanner;

public class repl81 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers that stores the following
		 * values{45, 78, 12, 67, 55, 89, 23, 77, 88}. Print the values using a for loop
		 * starting at index 1 and increment by 3, and then print value divided by its
		 * index.
		 * 
		 * Output: 78 13 11
		 */
		
		int [] a = new int [9];
		a [0] = 45;
		a [1] = 78;
		a [2] = 12;
		a [3] = 67;
		a [4] = 55;
		a [5] = 89;
		a [6] = 23;
		a [7] = 77;
		a [8] = 88;
		
		for (int i=1; i<a.length; i+=3) {
			System.out.println((a[i]/i) );
		}
		
	}

}

//int[] arr = {45, 78, 12,  67, 55, 89, 23, 77, 88};
//
//for (int i = 1; i < 9; i+=3) {
//
//	System.out.print(arr[i]/i + " ");
//}

