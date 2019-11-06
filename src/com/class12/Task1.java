package com.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
//		
//		int [] array2 = {2,3,4,7};
//		
//		for (int i:array2) {
//			System.out.println(i);
//		}
		
		Scanner scan = new Scanner (System.in);
		int [] arr = new int [3];
		
		for ( int i = 0 ; i<arr.length; i++) {
			arr [i] = scan.nextInt();
		}
		
		for ( int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
