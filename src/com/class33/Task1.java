package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	// Create an arrayList of cars and retrieve all the values using 3 different
	// ways

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Corolla");
		cars.add("Scion");
		cars.add("Subaru");

		// 1.
		System.out.println("-- First Way ---");
		for (String arrCars : cars) {
			System.out.println(arrCars);
		}

		// 2.
		System.out.println("-- Second Way ---");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		// 3.
		System.out.println("-- Third Way ---");
		Iterator<String> iterator = cars.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.hasNext());
		}
	}

}
