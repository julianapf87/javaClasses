package com.class25_1;

public class ConstructorOverloading {
	
	//differnet amount of paremeters
	
	ConstructorOverloading(){
		System.out.println("I am non argument constructor");
	}
	ConstructorOverloading(String str){
		System.out.println("I am non argument constructor");
	}
	
	//having different type of parameter
	ConstructorOverloading (int num ){
		System.out.println("I am constructor with 1 int parameters");
	}
}

