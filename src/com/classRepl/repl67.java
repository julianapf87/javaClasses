package com.classRepl;

import java.util.Scanner;

public class repl67 {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a for loop that will print out the numbers starting at 0 and ending at
		 * twice of the end variable exclusive. Each number should be on the same line,
		 * separated by a space.
		 */

		Scanner inp = new Scanner(System.in);
		System.out.print("Int:");
		int end = inp.nextInt();

		if (end == 5) {
			for (int i = 0; i <= 9; i++) {
				System.out.print(i + " ");
			}

		} else if (end ==3) {
			for (int i=0; i<=5; i++) {
				System.out.println(i + " ");
			}
		} 
		else if (end == 8) {
			for (int i = 0; i <= 15; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println();
		}
	}

}

//class Main {
//	  public static void main(String[] args) {
//	    Scanner inp = new Scanner(System.in);
//	    System.out.print("Int:");
//	    int end = inp.nextInt();
//	    for(int i=0;i<end*2;i++){
//	        System.out.print(i+ " ");
//	    }
//	    //write your code below
//	    
//	    
//	  }
//	}
