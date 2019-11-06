package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
	
		//1. declaring variable num1 that will hold value of int and assigning/initializing value of 123 to it.
	
		int num1=123;
		int num2=234;
		int num3=555;
		//System.out.println(num1);
		
		//2. Declare variable first and then assign the value
		int n1;
		int n2;
		int n3;
		n1=45;
		n2=43;
		n3=23;
		
		//3. Declare all variables together and then assign value
		int number1, number2, number3;
		number1=12;
		number2=45;
		number3=67;
		//System.out.println(number3);
		
		number3=1000;
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);

		char myVariable='*';
		System.out.println(myVariable);
		
		
		number2=number1;//12
		System.out.println(number2);
		
		//number2=false; -> compile error asking to change datatype of variable number2 to boolean 
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;// isSnow=false
		System.out.println(isSnow);
		
		isSnow=true;
		System.out.println(isSnow);
		
		
		
}
}
