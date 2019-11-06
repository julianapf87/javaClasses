package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		String[] animals = { "Car", "Cow", "Dog", "Snake", "Elephant" };
		// I want to print all values from an array
		// when value is Dog --> I love Dogs

		int size = animals.length;

		for (int b = 0; b < size; b++) {

			if (animals[b].equals("Dog")) {
				System.out.println("I love dogs");
			} else {
				System.out.println(animals[b]);
			}
		}
	}

}
