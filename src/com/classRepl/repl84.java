package com.classRepl;

public class repl84 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the highest value in the array.
		 */
		
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		
		int max =0;
		
		for ( int i = 0; i < a.length; i++) {
			for (int b = 0; b< a[i].length; b++) {
				if (a[i][b] > max) {
					max = a[i][b];
				}
			}
		}System.out.println(max);
	
		
		
//		Yuliia Hudzenko 11:00 AM
//		
		//int max = 0;
		
//		        for( int d =0; d< a.length; d++){
//		
		//		for (int f = 0; f< a[d].length; f++){
		
//		            if (a[d][f] > max) {
		
//		                max = a[d][f];
//		          }
//		          }
//		        }
//		        System.out.println(max);
		
	}

}
