package com.classRepl;

import java.util.Scanner;

public class repl78 {

	public static void main(String[] args) {
//		Note: Create Scanner class
//
//		Write an array with size of 5. 
//		Use a loop to input values to the array (don't print any prompt message for Scanner).
//		Then print out all the elements you have created in the first loop in reverse order. 
//
//		Example: 
//		Input: 
//		1
//		2
//		3
//		4
//		5
//
//		Output:
//		5
//		4
//		3
//		2
//		1

		Scanner scan = new Scanner(System.in);
		int enteredNum = 0;

		int[] num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;

		int size = num.length;

		for (int i = 0; i < 5; i++) {
			enteredNum = scan.nextInt();
		}for (int b = 5; b >= 0; b--) {
			System.out.println(enteredNum);
		}System.out.println();
	}
}

//for ( int d = 5; d>=1; d--) {
//	for (int v = 5; v>0; v-- ) {
//		System.out.print(d);
//	}System.out.println();