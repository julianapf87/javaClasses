package com.class12;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create 2 strings and intialize them with some value. Implement the following
		 * methods on those strings:
		 * 
		 * sen.length ();
		 * sen.equals(); 
		 * sen.contains(); 
		 * sen.toUpperCase();
		 * sen.toLowerCase(); 
		 * sen.equalsIgnoreCase();
		 */

		String a = new String ("It was a rainy morning");
		String b = new String ("I hope it will stop raining by evening");
		
		// sen.length ();
		int lengtha = a.length();
		int lengthb = b.length();
		System.out.println("The length of a is " + lengtha);
		System.out.println("The length of b is " + lengthb);
		System.out.println();
		
		// sen.equals();
		String eqb = "I hope it will sTop raining By evening";
		boolean isEqual = b.equals(eqb);
		System.out.println(isEqual);
		System.out.println();
		
		// sen.contains();
		String sen = "raining";
		System.out.println(b.contains(sen));
		System.out.println();
		
		//sen.toUpperCase();
		String Upa = a.toUpperCase();
		System.out.println(Upa);
		String Upb = b.toUpperCase();
		System.out.println(Upb);
		System.out.println();
		
		//sen.toLowerCase();
		String Loa = a.toLowerCase();
		System.out.println(Loa);
		String Lob = b.toLowerCase();
		System.out.println(Lob);
		System.out.println();
		
		//sen.equalsIgnoreCase();
		String sen1 = "raining";
		System.out.println(b.equalsIgnoreCase(a));
		System.out.println();
		
		
	
	}

}
