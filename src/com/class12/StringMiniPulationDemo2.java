package com.class12;

public class StringMiniPulationDemo2 {

	public static void main(String[] args) {

		/*
		 * .contains (); THIS IS CASE SENSITIVE This method searches the sequence of
		 * characters in the string. If the sequences of characters are found, then it
		 * returns true otherwise returns false.
		 */
		String sentence = "It was raining";
		String sen = "raining";
		System.out.println(sentence.contains(sen));
		System.out.println(sentence.contains("was"));
		System.out.println();
		
		// .startsWith();   This method test if a string starts with the specified prefix beginning
		
		String str2 = "It is very hot in the class";
		System.out.println("Does this string begins with It ?" + str2.startsWith("It"));
		System.out.println("Does this string begins with It ?" +str2.startsWith("is",3));
		System.out.println();
		
		// .endsWith();      This method tests if this string ends with specified suffix
		System.out.println("Does this string ends with s?" + str2.endsWith("class"));
		

	}

}
