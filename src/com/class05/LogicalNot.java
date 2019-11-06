package com.class05;

public class LogicalNot {

	public static void main(String[] args) {
		boolean b1 = !true;
		boolean b2 = !false;

		System.out.println(b1);
		System.out.println(b2);

		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		boolean isRain=false;
		if (!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Do not take an umbrella");
		}
		
		// let's compare 2 numbers using NOT operator
		
		int num1=11;
		int num2=11;
		if (num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		
		if (!(num1==2)) {
			System.out.println("Numbers are NOT equal");
		}else {
			System.out.println("Numbers are equal");
		}
		
		//if name is not Mary or Anna then you are not my sister 
		String name="Mary";
		String name2="A";
		
		if (!(name.equals("Mary") || name.equals("Anna"))) {
			System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
		}
	}

}
