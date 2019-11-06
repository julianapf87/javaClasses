package com.classRepl;

public class repl44 {
	/*
	 * Step 1: You have variable iSwitch=6;
	 * 
	 * Step 2: Do the switch for the other cases but for your value it should print
	 * out "Not in the list"
	 * 
	 * Output: "Not in the list"
	 */
	public static void main(String[] args) {
		int iSwitch = 6;
		String info;

		switch (iSwitch) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		default : 
			System.out.println("Not in the list");
			break;

		}
	}
}
