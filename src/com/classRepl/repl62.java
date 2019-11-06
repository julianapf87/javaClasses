package com.classRepl;

public class repl62 {

	public static void main(String[] args) {
		/*
		 * Write a program that use for loop to prints multiples of 3 between 1 and 20
		 * on one line.
		 * 
		 * Must not include the number 20 in the output
		 * 
		 * Hint : 3*1=3 3*2=6 3*3=9 3*4=12 3*5=15 3*6=18
		 * 
		 * Output: 3 6 9 12 15 18
		 * 
		 */
		System.out.println("");
		
		int i= 0;
		
		for (i =3; i <=20; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}

	}

}
