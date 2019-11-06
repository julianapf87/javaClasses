package com.classRepl;

public class repl61 {

	public static void main(String[] args) {
		/*
		 * Create a for loop that prints out odd numbers from 5 to 22
		 * 
		 * Increment by 1 example(i++)
		 * 
		 * Must not include the number 22 in the output
		 * 
		 * Output: 5 7 9 11 13 15 17 19 21
		 */
		
		 int a = 22;
		    System.out.println();
		 
		    for ( a = 5; a <22; a++) {
		    	if(a%2==1) {
		    		System.out.println(a);
		    	}
		    }
	}

}
