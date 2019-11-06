package com.classRepl;

import java.util.Scanner;

public class repl30 {

	public static void main (String [] args) {
		Scanner age = new Scanner (System.in);
		System.out.println( "Please enter your age");
		int age1 = age.nextInt();
		
		if (age1 >=18) {
			System.out.println("You are elegible to vote");
		}else {
			System.out.println("You are not elegible to vote");
		}
		
	}
}
