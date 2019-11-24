package com.class15;

public class StringMethods {

	public static void main(String[] args) {
		// 
		
		String str = "Java classes at Syntax are awesome";
		
		str = str.replace("awesome", "great");
		System.out.println(str);
		
		str = str.replace("a", "1234 68#$% %%%%");
		System.out.println(str);
		
		System.out.println("=======================");
		
		//replaceAll -> specify regular expression
		// let's remove all special characters
		
		str = str.replaceAll("[^A-Za-z]", "");
		System.out.println(str);
		System.out.println("====================");
		
		//split
		
		String myString = "Java classes at Syntax are awesome";
		String [] array = myString.split("c");
		
		System.out.println(array.length);
		
		
		
		
		
		
		
	}

}
