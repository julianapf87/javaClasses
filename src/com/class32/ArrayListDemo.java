package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		// to store vaues inside your collection
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");

		// to retrieve the value from array list
		System.out.println(arrayList.get(1));

		// add more values
		arrayList.add("James");
		arrayList.add("John");
		arrayList.add("Jane");

		// how many elements inside the arrayList?
		int size = arrayList.size();
		System.out.println(size);

		// creating an object of array list that will hold numeric values
		ArrayList<Integer> numArrList = new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		numArrList.set(0, 1000);
		System.out.println(numArrList);
		
		// retrieving values
		System.out.println(numArrList.get(2));
		//int num = control or counter --> controlsc # of iterations fro the loop
		for (int num = 0; num < numArrList.size(); num++) {
			
			Integer myInteger = numArrList.get(num);
			System.out.println(numArrList.get(num));
		}
		
		// enhanced for loop
		for (Integer numbers : numArrList) {
			System.out.println(numbers);
		}

	}
}
