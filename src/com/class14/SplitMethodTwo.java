package com.class14;

public class SplitMethodTwo {

	public static void main(String[] args) {

		// how to separate comma delimated string.

		String str = "If you come to class early,"
				+ " then you can study more, "
				+ "also you can learn more, "
				+ "and you can leave early";
		 
		String [] array = str.split(",");
		 
		 for (int i=0 ; i<array.length; i++) {
			 System.out.println(array[i].trim());
		 }
		 System.out.println("***************");
		 
		 String str1 = "Welcome to Syntax Technologies";
		 String [] array1 = str1.split(" ", 3);
		 
		 
		 System.out.println(array1.length);
		 
		 for (int i=0; i <array1.length; i++) {
			 System.out.println(array1[i]);
		 }
		 
	}

}
