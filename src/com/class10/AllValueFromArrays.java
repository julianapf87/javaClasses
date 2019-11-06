package com.class10;

public class AllValueFromArrays {

	public static void main(String[] args) {
		int a = 2;

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		a += 2;
		System.out.println(grades[a]);

		a--;
		System.out.println(grades[a]);

		System.out.println("********************");
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);

		System.out.println("********************");
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i]);
		}

		System.out.println();
		System.out.println("********************");
		char[] grades1 = new char[6];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';
		System.out.println(grades1[1]);

		System.out.println("********************");

		String[] animals = { "Car", "Dog", "Cow", "Snake", "Elephant" };
		int size = animals.length;

		for (int i = 0; i < size; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		System.out.println("==========================================");
		System.out.println();
		/*
		 * Create an array to store 5 double values, print all in 1 line
		 */

		double[] values = { 1.5, 2.3, 4.5, 7.9, 10.0 };
		int size1 = values.length;

		for (a = 0; a < size1; a++) {
			System.out.print(values[a] + " ");
		}
	}

}
