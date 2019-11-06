package com.class04;

public class IfElseRecap {
public static void main(String[] args) {
	
	/*CLASS SCHEDULE
	 * If Tuesday 	SDLC
	 * If Wednesday	Java Review
	 * If Thursday	SDLC
	 * If Saturday	Java Coding
	 * If Sunday	My favorite Java coding
	 */

	int day=1;
	
	if (day == 2) {
		System.out.println(" SDLC Class");
	} else if ( day == 3) {
		System.out.println(" Review Class");
	} else if (day ==4 ) {
		System.out.println( "SDLC Class");
	} else if (day == 6) {
		System.out.println( "Java Class");
	} else if (day == 7) {
		System.out.println(" Favorite Java Class");
	} else {
		System.out.println("There is no class at school");
	}
	
}

}
