package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		String str = "12345H888el00987lo";
		
		System.out.println(str.replaceAll("[0-9]", "")); // to remove all numbers
		System.out.println(str.replaceAll("[^0-9]", "")); // to remove text		
		System.out.println(str.replaceAll("a-zA-Z", "")); // to remove text as well, and leave only the numbers
		
		//Remove everything except text
		String str2 = "Hi@#$$%How#$%are#$%#$you";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		
		System.out.println(str2.replace("How", ""));
		
		System.out.println(str2.replaceAll("\\W", ""));
	}

}
