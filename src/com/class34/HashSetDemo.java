package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// lets create a collection of vegetables where i do not want to have duplicates
		// hset order of the elements is not preserved
		HashSet<String> hset = new HashSet<>();
		// Storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("carrot");
		hset.add("zuccini");

		System.out.println(hset.size());
		System.out.println(hset);

		// they do not have any methods to retrieve elements from the collection
		// .get ();, .set ();

		// how can we retrieve all elements?
		// iterator

		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		
		//enhanced for loop
		for (String el : hset) {
			System.out.println(el);
		}
	}
}
