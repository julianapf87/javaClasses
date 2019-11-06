package com.classRepl;

import java.util.Scanner;

public class repl99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * If browser is ChRoME it should print the: "Proceed with Chrome browser"
		 * 
		 * If browser is FireFOX it should print the: "Proceed with Firefox browser"
		 * 
		 * If browser is IE it should print the: "Proceed with IE browser"
		 * 
		 * If any other browser it should print the: "Invalid browser"
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the browser name to proceed further with execution");
		
		String browser = sc.nextLine();
		String str = "chrome";
		String str1 = "firefox";
		String str2 = "ie";
		
		if (browser.equalsIgnoreCase(str)) {
			System.out.println("Proceed with Chrome browser");
		}else if (browser.equalsIgnoreCase(str1)) {
			System.out.println("Proceed with Firefox browser");
		}else if (browser.equalsIgnoreCase(str2)) {
			System.out.println("Proceed with IE browser");
		} else {
			System.out.println("Invalid browser");
		}	
	}

}
