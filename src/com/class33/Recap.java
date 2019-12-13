package com.class33;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	
	public static void main(String[] args) {
		//Lets create an ArrayList to store numbers
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(10);
		number.add(100);
		number.add(1000);
		
		int size = number.size();
		System.out.println(size);
		
		//add more
		number.add(10000);
		//remove
		number.remove(2);
		//number.remove(size - 1);
		number.remove(1);
		System.out.println(number);
		
		
		//retrieve value from an arrayList
		int element = number.get(0);
		System.out.println(element);
		
		//1. for loop
		for (int i = 0; i<number.size(); i++) {
			System.out.println(number.get(i));
		}
		
		//2. Advanced loop
		for (Integer num : number) {
			System.out.println(num);
		}
		
		//I want to get the values backward
		
		for (int i = number.size()-1 ; i >=0; i--){
			System.out.println(number.get(i));
		}
		
		//3. Using iterator
		Iterator <Integer> iterator = number.iterator();
		
		while (iterator.hasNext()) {
			
			int numbers = iterator.next(); // autounboxing
			if(numbers%2==0) {
				
			}
 		}
	
	}

}
