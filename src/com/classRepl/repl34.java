package com.classRepl;

public class repl34 {
	public static void main(String[] args) {
		/*
		 * For you to do: Declare 4 int variables a, b, c and d. Your variable c is the
		 * result of addition of a & b. Variables a & b should be more than d, and c
		 * should be more than d.
		 * 
		 * Output: true true
		 * 
		 * Hint: you have 2 outputs meaning you need to have 2 printing statements
		 */
		int a, b, c, d;
		a = 6;
		b = 5;
		c = (a + b);
		d = 4;

		if (a > d && a > d) {
			System.out.println("Variable a & b are more than d");
		} else if (c > d) {
			System.out.println("Variable c is more than d");
		}else {
			System.out.println("Invalid");
		}

	}

}
