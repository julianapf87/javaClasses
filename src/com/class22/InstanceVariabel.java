package com.class22;

public class InstanceVariabel {
	String name = "Samir";

	public static void main(String[] args) {
		String name = "Burcu";
		System.out.println(name);
		
		InstanceVariabel obj = new InstanceVariabel();
		System.out.println(obj.name);
		
		//changing the value of the instance variable
		obj.name = "John";
		System.out.println(obj.name);
		
		//creating a new instance of class InstanceVariabel
		InstanceVariabel obj1 = new InstanceVariabel();
		System.out.println(obj1.name);
	}

}
