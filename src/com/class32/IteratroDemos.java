package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratroDemos {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Amaya");
		names.add("Aliah");
		names.add("Amelia");
		names.add("Amara");
		names.add("Angela");

		// to retrieve values from an arraylist
		// 1. for loop

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//2. enhanced for loop
		
		for (String name:names) {
			System.out.println(name);
		}
		//3. using iterator
		 Iterator<String>iterator = names.iterator();
	}
}
