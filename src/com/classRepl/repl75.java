package com.classRepl;

public class repl75 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array with the following values{s, a, y, b,
		 * n, c, t, d, a, e, x} and prints the values starting at index 0 and multiple
		 * of 2 using a for loop.
		 * 
		 * Output: syntax
		 * 
		 */

		char[] letters = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };

		int size = letters.length;

		for (int i = 0; i < size; i+=2) { 
	
			System.out.print(letters[i]);
	
		}
	}
}

//
//	int[] nums = new int[9];
//
//	nums[0] = 45;
//	nums[1] = 78;
//	nums[2] = 12;
//	nums[3] = 67;
//	nums[4] = 55;
//	nums[5] = 89;
//	nums[6] = 23;
//	nums[7] = 77;
//	nums[8] = 88;
//	
//	
//	System.out.println(nums[0] + " " + nums[2] + " " +nums[4] +" " +nums[6] +" " +nums[8] );
//}
