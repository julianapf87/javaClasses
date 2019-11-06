package com.class13;

public class ReplaceMethodsStringClass {

	public static void main(String[] args) {
		/*
		 * This method returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
		 * 
		 */
		
		String str = "Hello Dear Dan, how are you Dan, How have you been?";
		String str1= "12-22-1990";
		
		System.out.println(str.replace('n', 'z'));
		System.out.println();
		System.out.println(str.replace("Dear", "Respected"));
		System.out.println();
		System.out.println(str.replace("Dan", "Juli"));
		System.out.println();
		System.out.println(str.replaceFirst("Dan", "Lupe"));
		System.out.println();
		System.out.println(str1.replaceAll("-", "/"));
		
		
		
		
	}

}
