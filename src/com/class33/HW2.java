package com.class33;

import java.awt.List;
import java.util.ArrayList; 
import java.util.Iterator;

public class HW2 {
	public static void main(String[] args) {
		/*
		 * Create an arrayList of words. Remove every word that ends with "e". Use
		 * iterator
		 */

		ArrayList<String> list = new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			if (it.next().endsWith("e")) {
				it.remove();
				break;
			}
		}
		System.out.println(list);
	}
}
