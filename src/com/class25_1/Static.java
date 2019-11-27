package com.class25_1;

public class Static {
	
	public static void method () {
		System.out.println("I am a method without parameters");
	}
	
	public static void method (String str) {
		System.out.println("I am a method with a string parameters");
	}
	public static void method (String str, int x) {
		System.out.println("I am a method with a string and int parameters");
	}
	
	public static void main(String[] args) {
		method();
		method("Hey");
		method("hey",5);
	}
}
