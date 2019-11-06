package com.class14;

public class StrignMethodRecap {

	public static void main(String[] args) {
		// .replace

		String str = "My Syntax Technologies is your place to study";

		System.out.println(str.replace('y', 'i'));
		System.out.println("***********");

		System.out.println(str.replace("your", "My"));

		// .replaceall
		String str2 = "Video provide a porweful way to help you prove your point."
				+ "When you clock Online Video, you can paste int eh embed" 
				+ "code for the videa you want to add";
		System.out.println(str2.replaceAll("way(.*)", ""));
		
		String str3 = "23H234e23ll23o";
		System.out.println(str3.replaceAll("[^0-9]", ""));
		System.out.println(str3.replaceAll("[^ A-z]", ""));
		
		System.out.println("*************");
		System.out.println(str2.replaceFirst(" ", ""));
		
		System.out.println("++++++++");
		System.out.println(str3.replaceAll("\\W", ""));
	}

}
