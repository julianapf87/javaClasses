package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {

		// create a collection that will store sweet types of objects and i do not care
		// about the order, as long as i do not have any duplicate objects.

		Set <Sweets> sweetSet = new HashSet<>();
		sweetSet.add(Sweets);
		sweetSet.add(new Sweets ("Cookies"));
		sweetSet.add(new Sweets ("Ice Cream"));
		sweetSet.add(new Sweets ("BAvlaka"));
		sweetSet.add(new Sweets ("Macaroons"));
		sweetSet.add(new Sweets ("Chocolates"));
		
		System.out.println(sweetSet.size());
		
		//how do we print the name of each sweet
		//enhanced loop:
		for ( Sweets element : sweetSet) {
			System.out.println(element.name);
		}
		
		//iterator
		  Iterator<Sweets> it = sweetSet.iterator();
		  while (it.hasNext()) {
			  System.out.println(it.next().name);
			  
		  }
	}
}
