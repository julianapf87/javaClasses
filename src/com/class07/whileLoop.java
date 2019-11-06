package com.class07;

public class whileLoop {

	public static void main(String[] args) {
		int time=8;
		
		if(time<12) {//condition is true
			System.out.println("Good Morning");//code executes 1
		System.out.println("--------------");	
		
		}while (time<12) {//while condition is true
			System.out.println("Good Morning");//code executes infinitely
			time ++;
			
		}
		
		// I want to print GM 5 times
		
		int i=3;
		while (i<9) {
			System.out.println("Good Afternoon");
			i++;
		}
		System.out.println("Outside of while loop");
	}

}
