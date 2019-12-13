package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorList {

	// create a list that will hold 5 instructors
	public static void main(String[] args) {

		List<Instructor> iList = new ArrayList<>();
		iList.add(new Instructor("Juliana", "Parra"));
		iList.add(new Instructor("Ariana", "Parra"));
		iList.add(new Instructor("Jose", "Parra"));
		iList.add(new Instructor("Cecilia", "Parra"));
		
		for (Instructor i : iList) {
			System.out.println(i.name + i.lastName);
		}
	}
}
