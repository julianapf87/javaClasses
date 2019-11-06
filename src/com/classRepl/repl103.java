package com.classRepl;

import java.util.Scanner;

public class repl103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    
		    char [] array = word.toCharArray();
		    
		    for (int i = 0; i<array.length; i++) {
		    	System.out.println(array[i]);
		    }
		    
	}

}
