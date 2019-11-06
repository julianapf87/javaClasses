package com.classRepl;

public class repl90 {

	public static void main(String[] args) {
		/*
		 * For you to do: Create a String named "name" and assign the value "Timmy" to
		 * it. Find out how many characters are there in the given String.
		 */

		String name = "Timmy";
		System.out.println(name.length());

		/*
		 * Create a String named s1 = "hello" check weather string is empty or not
		 * Create a String named s2 = "" check weather string is empty or not
		 */

		//String s1 = "hello";
		String s2 = " ";

	//	System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());

//		Create first String named str1= syntaxsolutions and convert into SYNTAXSOLUTIONS 
//		Create first String named str2=  SYNTAXSOLUTIONS and convert into syntaxsolutions

		String str1 = "syntaxsolutions";
		String str2 = "SYNTAXSOLUTIONS";

		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());

		/*
		 * For you to do:
		 * 
		 * Validate if the string ends with "u" prints the Boolean value accordingly.
		 * Validate if the string ends with "world" prints the Boolean value
		 * accordingly. 
		 * Validate if the string ends with "are" prints the Boolean value
		 * accordingly. 
		 * Validate if the string ends with "you" prints the Boolean value
		 * accordingly.
		 */
		
	//	public static void main(String[] args) {
		
		 	
		   String s1="hello how are you"; 
		   System.out.println(s1.endsWith("u"));
		   System.out.println(s1.endsWith("world"));
		   System.out.println(s1.endsWith("are"));
		   System.out.println(s1.endsWith("you"));
		
		

	}

}
