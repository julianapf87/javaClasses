package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Syntax Technologies Inc";
		
		System.out.println(str.charAt(5));
		
		char letter = str.charAt(5);
		System.out.println(letter);
		
		//System.out.println(str.charAt(str.length()));
		System.out.println(str.charAt(str.length()-1));
		
		//get a substring from a String
		//Syntax
		String substr1 = str.substring(0,6);
		System.out.println(substr1);
		
		String substr2 = str.substring(7);
		System.out.println(substr2);
		
	
	}

}
