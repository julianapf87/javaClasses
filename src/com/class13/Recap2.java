package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";

		String str3 = new String("Bye");
		String str4 = new String("Bye");

		System.out.println(str1.contentEquals(str2)); // true
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1 == str2); // true

		System.out.println("***********************");

		System.out.println(str3.contentEquals(str4)); // true
		System.out.println(str3 == str4); // false
		// What is the difference between .equals and == ?
		// == compares the 2 strings reference variable. If it is pointing to the same
		// object or not. .equals compares if the strings are pointing to the same
		// object

		System.out.println("***************");
		System.out.println(str1.contains("ll"));

		System.out.println("===============StarsWith and EndsWith================");
		String str5 = ("Today is Saturday");
		System.out.println(str5.startsWith("Today"));
		System.out.println("day");

		System.out.println("===============Concat =================");
		System.out.println(str5.concat(" and we have Java class"));

		System.out.println("=========Trim==========");
		String str6 = "           It is sunny           ";
		System.out.println("Before triming: " + str6);
		System.out.println(str6.trim());
		
		System.out.println("===========Index of and CharAt ================");
		String str7 = "Tomorrow we will be done with String Manipulation";
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e', 11));
		System.out.println(str7.indexOf("we"));
		System.out.println(str7.charAt(10));
	}

}
