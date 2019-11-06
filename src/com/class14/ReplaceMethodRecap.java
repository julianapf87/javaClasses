package com.class14;

public class ReplaceMethodRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Video provide a porweful way to help you prove your point."
				+ "When you clock Online Video, you can paste int eh embed" 
				+ "code for the videa you want to add";
		System.out.println(str.toLowerCase().replaceAll("Video", "Audio"));
		System.out.println(str.equals("video"));
	}

}
