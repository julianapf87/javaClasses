package com.classRepl;

public class repl60 {

	public static void main(String[] args) {
		/*
		 * Create a for loop that prints out even numbers from 2 to 14
		 * 
		 * Increment by 1 ONLY
		 * 
		 * Must include the number 14 in the output
		 * 
		 * Output: 2 4 6 8 10 12 14
		 */
		int a = 14;
	    System.out.println();
	    
	    for (a=2; a<=14; a++) {
	    	if(a %2==0) {
	    		System.out.println(a);
	    	}
	    }

	}

}
