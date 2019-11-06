package com.classRepl;

public class repl53 {

	public static void main(String[] args) {
		/*
		 * For you to do: Print 1 to 10 Numbers except 7, 8, 9, 5 using the While loop
		 * 
		 * Step 1: Initialize the i value as int i=1
		 * 
		 * Step 2: Create the while loop to check the condition
		 * 
		 * Step 3: Write the if condition for validation part
		 * 
		 * Step 4 : It should print 1 2 3 4 6 10
		 */

		int a = 1;

		while (a <= 10) {
			if (a == 5 || a == 7 || a == 8 || a == 9) {
				a++;
				continue;
			} else {
				System.out.println(a);
				a++;
			}

		}
	}

}
