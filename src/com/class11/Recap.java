package com.class11;

public class Recap {

	public static void main(String[] args) {

		int[] array = new int[6];
		array[0] = 33;

		int[] arr = { 2, 3, 5, 7 };
		
//		for (int g= 0; g<arr.length; g++) {
//			System.out.println(arr[g]);
//		}
		for (int ar:arr) { // Only to stach values for arrays or collections
			System.out.println((ar)); 
		}
		
		

		int[] numbersList = { 2, 3, 5, 7 };
		
		for (int elements:numbersList) { // Only to store values for arrays or collections
			System.out.println((elements)); 
		}
		
		
		
//		
//		System.out.println(arr[2]);
//		//         1          2     4
//		for (int s=1; s<=12; s++) {
//			//3
//			for (int k =24; k<=30; k++) {
//				System.out.println(k);
//				}
//			System.out.println(s);
//		}

	}

}
