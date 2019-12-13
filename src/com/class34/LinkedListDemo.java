package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		// adding elements
		llist.add("Hello"); // 0
		llist.add("Bye");// 1
		llist.add("Hello"); // 2
		llist.add("Bye");// 3
		llist.add(2, "How are you?");
		System.out.println(llist);

		// replace 1 element
		llist.set(1, "Good Bye");
		System.out.println(llist);

		// retireve 1 element
		String element = llist.get(2);
		System.out.println(element);

		// retrieve all elements
		// 1. for loop
		System.out.println("--- 1st Way : For loop ---");

		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}

		//2. enhanced loop
		System.out.println("--- 2st Way : Enhanced loop ---");
		for (String  el:llist) {
			System.out.println(el);
		}
		
		//3. Iterator
		System.out.println("--- 3st Way : Iterator ---");
		 Iterator<String>it = llist.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next());
		 }
	}
}
