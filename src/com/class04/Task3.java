package com.class04;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	
		Scanner age = new Scanner (System.in);
		System.out.println("Please enter your age");
		int age1=age.nextInt();
		
		if (age1 >= 18) {
			System.out.println("You will get a driver's license");
		}else {
			System.out.println("You will get a driver's permit");
		}
		
	}
}
