package com.class11;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 * 
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */
		String[] cars = { "BMW", "Scion", "Rouge", "Camaro", "MiniCooper", "STI" };
		int size = cars.length;

		for (int i = 0; i < size; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("********************");
		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */

		int[] num = { 1, 2, 3, 4, 5, 6 };
		int size1 = num.length;
		int sum = 0;
		for (int i = 0; i < size1; i++) {
			sum = sum + num[1];
		}
		System.out.println(sum);

		System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */

		String[] countries = { "France", "Ecuador", "Peru", "England" };
		int size2 = countries.length;

		for (int i = 0; i < size2; i++) {
			if (countries[i].equals("France")) {
				System.out.println("Paris");
			} else if (countries[i].equals("Ecuador")) {
				System.out.println("Quito");
			} else if (countries[i].equals("Peru")) {
				System.out.println("Lima");
			} else if (countries[i].equals("England")) {
				System.out.println("London");
			}
		}
		
		System.out.println("+++++++++++++++++++++");
		String[] countries2 = { "France", "Ecuador", "Peru", "England" };
		
		for (String capital:countries2) {
			switch (capital) {
			case "France":
				System.out.println("Paris");
				break;
			case "Ecuador":
				System.out.println("Quito");
				break;
			case "Peru":
				System.out.println("Lima");
				break;
			case "England":
				System.out.println("London");
				break;
			
			}
		}
	}

}
