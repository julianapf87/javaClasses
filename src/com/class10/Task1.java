package com.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 */
		int a = 2;

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		a += 2;
		System.out.println(grades[a]);

		a--;
		System.out.println(grades[a]);
		
		System.out.println("********************");
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		
		System.out.println("********************");
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i]);
		}
		
		System.out.println();
		System.out.println("********************");
		char[] grades1 = new char[6];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';
		System.out.println(grades1[1]);
		
		System.out.println("********************");
		
		String [] animals = {"Car", "Dog", "Cow", "Snake", "Elephant"};
		int size= animals.length;
		
		for (int i=0; i<size; i++) {
			System.out.print(animals [i] + " ");
		}

		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 */

		System.out.println("********************");
		String[] names = { "Juliana", "Oleksii", "Elina", "Gabriel" };
		System.out.println(names[0]);

		String[] names1 = new String[4];
		names1[0] = "Juliana";
		names1[1] = "Oleksii";
		names1[2] = "Elina";
		names1[3] = "Gabriel";
		System.out.println(names1[0]);

		/*
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using element of array: “Saturday is Java coding Day”.
		 */
		System.out.println("********************");
		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

		String[] words1 = new String[5];
		words1[0] = "Java";
		words1[1] = "Saturday";
		words1[2] = "day";
		words1[3] = "coding";
		words1[4] = "is";

		System.out.println(words1[1] + " " + words1[4] + " " + words1[0] + " " + words1[3] + " " + words1[2]);
	}

}
