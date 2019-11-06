package com.class14;

public class toCharArrayMethod {

	public static void main(String[] args) {
		/*
		 * toCharArray
		 * this method converts this string to a new character array 
		 */
		String str = "Syntax Technologies";
		
		char[] array = str.toCharArray();
		
		for (char i:array) {
			System.out.print(i);
		}
		


	}

}
