package com.review4;

public class ReverseArray {

	public static void main(String[] args) {
		/*
		 * 
		 *
		 */
		
		String [] animals= {"dog", "cat", "mouse", "bird", "horse" };
		
		for (int i = animals.length-1; i>=0; i--) {
			System.out.println(animals[i]);
		}
		
		
		System.out.println("+++++++++++");
		String [] animals1= {"dog", "cat", "mouse"};
		for ( int b = 0; b <animals1.length; b++) {
			System.out.println(animals1[b]);
		}
		System.out.println("+++++++++++");
		System.out.println("Reverse");
		for ( int i = animals1.length - 1; i>=0; i--) {
			System.out.println(animals1[i]);
		}
	}
	
	

}
