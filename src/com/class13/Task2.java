package com.class13;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */

		String a = "Sunday";

		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}

		System.out.println();
		System.out.println("====================");
		System.out.println();
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */

		String b = "Hello, how are you?";

		if (!b.isEmpty()) {
			if (b.length() % 2 !=0 && b.length() >= 3) {
				System.out.println(b.charAt(b.length() / 2));
			}
		}
	}
}

//
//String str1=“Hellourwewr”;
//
//int lenght=str1.length();
//int middle=str1.length()/2;
//
//System.out.println();
//if(!str1.isEmpty()) {
//    if(lenght%2!=0 && lenght>=3) {
//        System.out.println(str1.charAt(middle));
//    