package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW4 {

	/*
	 * Creat an arraylist of even numbers from 1 to 50. Using iterator remove any
	 * number that is divisible by 5 from that arraylist
	 */
	public static void main(String[] args) {
		
		//creating an object of arraylist and referring to the list
		List<Integer> numbers = new ArrayList<>();
		//storing only even number using loop
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		//Removin numbers that are divisible by 5 using iterator
		
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			if (it.next() % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}
