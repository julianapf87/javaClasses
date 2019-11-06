package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		String [] actualName = {"John", "Smith", "Alex", "Tanaz"};
		
		String [] expectedName = {"Smith", "John", "Alex", "Tanaz"};
		
		//This is to sort elements of the array
		Arrays.sort(actualName);
		
		System.out.println(Arrays.toString(actualName));
		Arrays.sort(expectedName);
		
		
		String actual = Arrays.toString(actualName);
		String expected = Arrays.deepToString(expectedName);
		
		System.out.println(actual.equals(expectedName));
	
		System.out.println("*********************************");
		
		String firstName = "Zom";
		String firsName2= " Ali";
		
		String firstName3 = "Ali";
		String firstName4 = " Zom";
		
		String actl = firstName + firsName2;
		
		String expt = firstName3 + firstName4;
		
		System.out.println(actl);
		System.out.println(expt);
		
		System.out.println("###################################");
		
		int [] numbers = {123, 34, 55, 66, 99};
		for (int i:numbers) {
			System.out.println(i+ " ");
		}
		
		System.out.println();
		System.out.println("***---***");
		
		Arrays.sort(numbers);
		for (int i:numbers) {
			System.out.println(i+ " ");
		}
	}

}
