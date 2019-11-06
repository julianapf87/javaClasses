package com.classRepl;

import java.util.Scanner;

public class repl38 {

	public static void main(String[] args) {
		/*
		 * Prompt user with a question: "Is it weekend?" If it is not a weekend -->
		 * subject="Manual testing" Otherwise --> subject="Java"
		 * 
		 * Output: "Today you will be learning ____"
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Is it weekend?");
		boolean info = scan.nextBoolean();
		String study;
		
		if (!(info)) {
			study = "Manual testing";
	}else {
		study = "Java";
		
	}
		System.out.println("Today you will be learning " + study);
	}
}
