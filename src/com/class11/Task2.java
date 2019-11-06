package com.class11;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type with 3 rows and 4
		 * columns and print all values of the whole array.
		 */

		int [] [] ar = {
				{1,5,6,8},
				{2,6,7,4},
				{5,90,2,5},
		};
		
		System.out.println("The numbers of the rows are " + ar.length);
		System.out.println("The numbers of the columns are " + ar[0].length);
		
		int sum = 0;
		for (int i=0; i<ar.length; i++) {
			for (int a=0; a<ar[i].length; a++) {
				System.out.print(ar [i][a] + " ");
				sum = sum + ar[i][a];
			}
			System.out.println();
		}
		System.out.println("The sum of all elements in the array are "+ sum);
		int sum1 = 0;
		for (int nums []: ar) {
			for (int getNum : nums) {
				sum1 =sum1 + getNum; 
			}
		}
		System.out.println("The sum of all elements in the array if " + sum1);
	}

}
