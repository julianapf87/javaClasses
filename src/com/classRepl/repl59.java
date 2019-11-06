package com.classRepl;

public class repl59 {

	public static void main(String[] args) {
		/*
		 * Create a for loop that prints out even numbers from 10 to 0
		 * 
		 * Must not include the number 0 in the output
		 * 
		 * Output: 10 8 6 4 2
		 * 
		 */

		 int a= 10;
		    System.out.println();
		
		    for (int i=10; i>=1; i--) {
		    	if (i %2==0) {
		    		System.out.println(i);
		    	}
		    }

	}

}
