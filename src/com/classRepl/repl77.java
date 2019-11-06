package com.classRepl;

import java.util.Scanner;

public class repl77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that creates an array of strings with the size being 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array
//
//		Example:
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday
//		Please enter day 4 of the week
//		Wednesday
//		Please enter day 5 of the week
//		Thursday
//		Please enter day 6 of the week
//		Friday
//		Please enter day 7 of the week
//		Saturday
//
//		Hint: you will need 2 for loops but it is not nested loops. 

		Scanner scan = new Scanner(System.in);

		String[] days1 = new String[7];

		for (int j = 0; j <= 6; j++) {
			System.out.println("Please enter day " + (j + 1) + " of the week");

			days1[j] = scan.nextLine();
		}
		for (int i = 0; i < 7; i++) {
			System.out.println(days1[i]);
		}

	}

}
//public static void main(String[] args) {
//    
//    
//    Scanner userInput = new Scanner(System.in);
//
//		String[] arr = new String[7];
//
//		for (int i = 0; i <arr.length; i++) {
//
//			System.out.println("Please enter day " + (i+1) + " of the week");
//			arr[i] = userInput.next();
//		}
//		
//		
//		for(int i=0; i<=arr.length-1; i++){
//			System.out.println(arr[i]);
//		}
//		
  
