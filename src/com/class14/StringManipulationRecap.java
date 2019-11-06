package com.class14;

public class StringManipulationRecap {

	public static void main(String[] args) {

		String str = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(str == str3);
		// The way we make this equal we need to set str3 = to str.
		// .equal we use to compare the content of a variable. The == sign we use it to
		// compare the reference variable

		System.out.println("*************");
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println("***************");

		System.out.println(str);

		System.out.println("*******************");
		String str2 = str.replaceAll("Hello", "Bye");
		System.out.println(str2);

	}

}
