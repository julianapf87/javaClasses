package com.review4;

public class ArrayIntro {

	public static void main(String[] args) {
		// Funny way
//		int a1 = 3;
//		int a2 = 5;
//		int a3 = 7;
//		int a4 = 2;
//		int a5 = 9;
//		
//		int sum = a1 + a2 + a3 + a4 + a5;
//		System.out.println(sum);
		
		// Serious way
		int [] a = new int [5] ;
		a [0] = 4;
		a [1] = 5;
		a [2] = 7;
		a [3] = 2;
		a [4] = 9;
		
		int sumOfArray = 0;
		
		for (int i = 0; i<a.length ; i++) {
			System.out.print(a[i] + " ");
			sumOfArray = sumOfArray + a[i];
		}
		System.out.println();
		System.out.println(sumOfArray);
		
		// Another way
		
		int [] b = {4, 5, 7, 2, 9};
		int sumB = 0;
		for ( int r = 0 ; r <b.length ; r++) {
			sumB = sumB + b [r];
		}System.out.println(sumB);
		System.out.println();
	}

}
