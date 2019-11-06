package com.classRepl;

public class repl85 {

	public static void main(String[] args) {
		/*
		 * Write a program that checks if a 2-D integer array is a square array,
		 * meaning, if its rows and columns are equal.
		 * 
		 * Hint:
		 * 
		 * int[][] a = { 
		 * 				{1,1,1},
		 *              {1,1,1}, 
		 *              {1,1,1} }; //should be true
		 * 
		 * int[][] b = { 
		 * 				{1,1,1,1},
		 *  			{1,1,1,1}, 
		 *  			{1,1,1,1} }; //should be false
		 */
		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
		
		boolean abc = true;
		
		for (int i = 0; i < a.length; i++) {
			for (int b=0; b<a[i].length; b++) {
				if (a.length != a[i].length) {
					abc = false;
					break;
					
				}
			}

		}System.out.println(abc);

	}

}
