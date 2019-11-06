package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {

		int[] array1 = new int[4];
		array1[0] = 12;
		array1[1] = 13;
		array1[2] = 14;
		array1[3] = 14;

//		System.out.println(array1 [1]);

		for (int i = 0; i < 4; i++) {
			System.out.println(array1[i]);
		}
		System.out.println();
		for (int a : array1) {
			System.out.println(a);
		}

		System.out.println();
		int[] array2 = { 2, 5, 4, 7 };
		for (int b : array2) {
			System.out.println(b);
		}
		System.out.println();
		int num1 = 0;
		for (int i = 0; i < 4; i++) {

			num1 = num1 + array1[i];
			System.out.println(array1[i]);
		}
		System.out.println("The sum of array1 is = "+ num1);
		System.out.println();
	}
}
