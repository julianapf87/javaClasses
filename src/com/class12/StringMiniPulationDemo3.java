package com.class12;

public class StringMiniPulationDemo3 {

	public static void main(String[] args) {
		// This method checks whether a String is empty or not. Thei method returns true
		// if the given string is empty, else it returns false.

		String str = "";
		System.out.println("Is this method empty?   \n" + str.isEmpty());
		String str2 = "Hello";
		System.out.println("Is this method empty?   \n" + str2.isEmpty());
		System.out.println();

//		if (!str.isEmpty()) {
//			System.out.println("This is not empty");
//		}else {
//			System.err.println("This is an empty string");
//		}

		System.out.println();
		String sentence = "Each day has a promise to brighten up the day,\nbut first you must allowed the sun to come your way";
		System.out.println(sentence);
		System.out.println();

		// .concat()
		// This method appends one String to the end of another. The method returns a
		// String with the value of the String passed in to the method appended to the
		// end of the String used to invoke this method

		String str3 = "Hello ";
		String str4 = "World ";
		String str5 = "People";

		System.out.println(str4 + " " + str3 + " " + str5);
		System.out.println(str3.concat(" " + str4).concat(" " + str5));
		System.out.println();

		// .trim ()
		// This method returns a copy of the string, with leading and trailing
		// whitespace omitted.

		String str6 = " How are you?  ";
		System.out.println(str6.trim());
		System.out.println();

		// char charAt ( int index);
		// This method returns the character located at the string's specified index.
		// The string indexes start from zero.

		String str7 = "We might be done early today";
		System.out.println(str7.charAt(19));
		System.out.println();

		// .indexOf();
		// This method returns the index within this string of the first occurrence of
		// the specified character or -1 of the character does not occur.
		
		String str8 = "We might not be done early";
		System.out.println(str8.indexOf('e'));
		System.out.println(str8.indexOf('e', 12));
		;

	}

}
