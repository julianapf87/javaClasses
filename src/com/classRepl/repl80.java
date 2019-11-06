package com.classRepl;

import java.util.Scanner;

public class repl80 {

	public static void main(String[] args) {
		/*
		 * Note: Create a Scanner Class
		 * 
		 * Create an int array with the size of 5 and input values with Scanner. Create
		 * a loop and enter values into one loop (don't print prompt question for
		 * Scanner). Create the second loop to print the values and it must be
		 * multiplied by 10. Print out each element of the array multiplied by ten, one
		 * element per line.
		 * 
		 * Example: Input: 1 2 3 4 5
		 * 
		 * Output: 10 20 30 40 50
		 * 
		 * 
		 */
		
	Scanner scan = new Scanner (System.in);
	
	int [] a = new int [5];
	
	for (int i=0; i<5; i++) {
		 a[i] = scan.nextInt();
		
	} for (int i=0; i<5; i++) {
		System.out.println((a[i]*10));
	}
	 
	}

}

//Scanner input = new Scanner(System.in);
//int[] arr = new int[5];
//for (int i=0;i<arr.length;i++)
//{
//	arr[i] = input.nextInt();
//}
//
//for (int i=0;i<arr.length;i++)
//{
//	System.out.println(arr[i]*10);
//
//}
