package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		 */
   
		String[] countries = { "USA", "Italy", "Germany", "France", "Belgium" };

		int size = countries.length;

		for (int i = 0; i < size; i++) {
			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (countries[i].equals("Italy")) {
				System.out.println("Rome");
			} else if (countries[i].equals("Germany")) {
				System.out.println("Berlin");
			} else if (countries[i].equals("France")) {
				System.out.println("Paris");
			} else if (countries[i].equals("Belgium")) {
				System.out.println("Brussels");
			}
		}
	}
}
