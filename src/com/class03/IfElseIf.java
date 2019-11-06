package com.class03;

public class IfElseIf {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		if (num1 > num2) {
			System.out.println("Num1 is larger than Num2");
		} else if (num1 == num2) {
			System.out.println("Num1 is equal to Num2");
		} else {
			System.out.println("Num1 is smaller than Num2");
		}

		System.out.println("******************");

		int day = 0;

		if (day == 1) {
			System.out.println("Today is Monday. I have to go to work");
		} else if (day == 2) {
			System.out.println("Today is Tuesday. I have to SDLC class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday. I have Java review class");
		} else if (day == 4) {
			System.out.println("Today is Thursday. I have SDLC Class");
		} else if (day == 5) {
			System.out.println("Today is Friday. Weekend is here");
		} else if (day == 6) {
			System.out.println("Today is Saturday. My favorite coding day");
		} else if (day == 7) {
			System.out.println("I love spending Sundays at Syntax");
		}
		System.out.println("I'm done with my statement");
		
		//ctrl+shift+f Formats the whole code 
	}
}
