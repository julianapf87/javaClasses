package com.class33;

import java.util.LinkedList;

public class LinkedListDemo {
	// Create a linked list of Strign objects
	public static void main(String[] args) {

		LinkedList<String> lList = new LinkedList<String>();
		lList.add("Hello");
		lList.add("Bye");
		
		System.out.println(lList.size());
		
		//retrieve
		System.out.println(lList.get(1));

		//to update / replace
		lList.set(2, "Hi");
		System.out.println(lList);
		
		//how to retrieve all values from linked list
	}
}