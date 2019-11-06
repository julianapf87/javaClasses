package com.class02;

public class Exercise {
public static void main(String [] args) {
	double num1, num2;
	
	num1=10.2;
	num2=20.5;
	
	double sum=num1+num2;
	double sub=num1-num2;
	double mult=num1*num2;
	double div=num1/num2;
	
	System.out.println(" The Sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum );
	System.out.println(" The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + div );
	System.out.println(" The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult );
	System.out.println(" The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div );
	
//Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ “
	
	double num3;
	
	num3 = 3.9;
	
	double Sq=num3*num3;
	
			System.out.println("The square of the " + num3 + " is " + Sq);
	
/*
 * Width = 5 
 * Height = 8
 */
	
	int W, H;
	
	W=5;
	H=8;
	
	int A= W*H;
	int P= 2*(W+H);
	
	System.out.println("The perimeter of a rectangle with width " + W + " and height " + H + " is equal to " + P + " and then area is " + A);
	
	String message="The perimeter of a rectangle with width " + W + " and height " + H + " is equal to " + P + " and then area is " + A;
	
	
	System.out.println(message);
	
	
	
	
	
	
	
	
}
}
