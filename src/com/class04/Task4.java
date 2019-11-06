package com.class04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner temp = new Scanner (System.in);
	
		System.out.println("Please enter the temperature");
		int temp1 = temp.nextInt();
				
		System.out.println("Please enter city");
		String city = temp.next();
		
		int convertedtemp=(temp1-32)*(5/9);
		
		System.out.println("The temperature in city " + city + " is " + convertedtemp);
		
				
			
		}
	}

