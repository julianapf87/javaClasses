package com.class22;

public class StaticVsNonStatic {
	//template for students (school, name, grade)
	
	static String School = "Syntax";
	String name;
	char grade;
	
	//instance method
	void getInfo () {
		System.out.println("My name is " + name + " and I am going to " + School + "and my grade is " + grade);
	}
	
	void getInfo1() {
		System.out.println("I am attending classes at " + School);
	}
	public static void main(String[] args) {
		/*
		 * Accesing static member within the same class jus use name for a variable or call method by its name only
		 */
		// you cannont access non static members within static methods
		
		
		System.out.println(School);
	
	}
}
