package com.class02;

public class ArithmeticOperations {
	/*
	 *Declare 2 variables and initialize them 
	 *Perform addition, subtraction, multiplication, and division 
	 */

	public static void main(String[] args) {
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		System.out.println(num1+"+"+num2+"=");
		
		int sum=num1+num2;
		
		System.out.println(num1+"+"+num2+"=" + sum);
		
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		// the addition of 2 numbers is _
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("The addition of 2 numbers is " + sum);
		System.out.println("The subtraction of 2 numbers is " + sub);
		System.out.println("The multiplication of 2 numbers is " + mult);
		System.out.println("The division of 2 numbers is " + div);
		
	}
}
