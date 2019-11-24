package com.class23;

public class Task {
	/*
	 * Write a program that will have a constructor:
	 *  one with parameters and second without any parameters. 
	 *  Create a separate Test class where you will execute both of the constructors.
	 *  
	 
	 */
	static String abc;
	public String def;
	public int ghi;
	
	Task (){
		System.out.println("This is my sting " + abc + " and also " + def + " the number assigned is " + ghi);		
	}
	Task (String abc, String def, int ghi){
		System.out.println(abc + " and also " + def + " the number assigned is " + ghi);
	}
public static void main(String[] args) {
		
		Task obj = new Task ();
		
		Task obj1 = new Task ("Hello", "Bye", 1);
	}
	
}
