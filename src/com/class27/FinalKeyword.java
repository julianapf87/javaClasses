package com.class27;

public class FinalKeyword {
	public final String str = "Hello";

	public static void main(String[] args) {

	}

	public final void hello(String name) {
		name = "JEsse";
		System.out.println("I am a final method in Parent Class" + name);
	}
}

class FinalKeywordChild extends FinalKeyword {
	// final methods cannot be overridden, we will get compiler Error (CE)
//	public final void hello() {
//		System.out.println("I am a final method in Parent Class");
//	}
}