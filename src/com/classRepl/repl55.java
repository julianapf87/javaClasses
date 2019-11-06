package com.classRepl;

public class repl55 {

	public static void main(String[] args) {
		/*
		 * For you to do: Create a do while loop that prints out numbers from 10 to 20
		 * 
		 * Must not include the number 20 in the output
		 * 
		 * Increment by 1 within the do example: do { a++; }
		 * 
		 * Output: 10 11 12 13 14 15 16 17 18 19
		 * 
		 * solution from previous assignment (#55). Change the condition in while to
		 * false value and execute your code.
		 *
		 */
		int i = 10;

		do {
			System.out.println(i);
			i++;
		} while (i < 20);
	}

}
