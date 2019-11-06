package com.class04;

public class NestedPractice {

	public static void main(String[] args) {
		boolean isFriday = true;
		int day = 13;

		if (isFriday) {
			System.out.println("Today is Friday");
			if (day == 13) {

				System.out.println("I will watch a scary movie");
			} else { 
				System.out.println("I will watch a comedy");
			}
		} else {
			System.out.println("Today is NOT Friday");
		}

	}

}
