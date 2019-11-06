package com.review4;

import java.util.Scanner;

public class WhileArray {

	public static void main(String[] args) {
		// The size of the array is fixed and you cannot change it

		String[] strArray = new String[10];

		Scanner scan = new Scanner(System.in);

		String name = null;
		int index = 0;

		do {
			System.out.println("Enter names, to stop enter 'stop' ");
			name = scan.nextLine();
			strArray[index] = name;
			index++;

		} while (!name.equals("stop"));
		
		
		for ( int i = 0 ; i<strArray.length ; i++) {
			System.out.println(strArray[i]);
		}
	}

}
