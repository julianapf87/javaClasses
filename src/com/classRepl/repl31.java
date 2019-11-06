package com.classRepl;

import java.util.Scanner;

public class repl31 {

	public static void main (String [] args) {
		Scanner length = new Scanner (System.in);
		
		System.out.println("Please enter the length");
		int length1 = length.nextInt();
		
		System.out.println("Please enter the width");
		int width = length.nextInt();
		
		if (length1 ==18 ) {
			System.out.println("The shape of your object is rectangle");
		} else if (length1 ==16) {
			System.out.println("The shape of your object is square");
		}
	}
}
