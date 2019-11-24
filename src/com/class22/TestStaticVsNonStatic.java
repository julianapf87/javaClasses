package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		/*
		 * How to access static members
		 * They can be accessed by className
		 */
		
		System.out.println(StaticVsNonStatic.School);
		
		
		/*
		 * How to access non static members
		 * They can be accessed by creating an object of that class
		 */
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name = "John";
		obj.grade = 'A';
		obj.getInfo();
		
	}

}
