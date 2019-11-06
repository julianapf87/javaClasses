package com.class12;

public class HowtoPrintRedColorError {

	public static void main(String[] args) {
		
		// to print error we can use System.err.println
		int a=2;
		if (a==20) {
			System.out.println("Number is " + a);
		} else {
			 System.err.println("Number was not 20 bus is "+a);
			 
		}

	}

}
 