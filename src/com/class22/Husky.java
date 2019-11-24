package com.class22;

public class Husky {

	static String breed = "Husky";
	static int paws = 4;
	static int tail = 1;

	String name;
	String color;
	
	void display () {
		System.out.println("Puppy name is " + name + " and its breed is " + breed);
	}

	public static void main(String[] args) {
		
		Husky puppy1 = new Husky();
		puppy1.name = "Meatball";
		puppy1.color = "Brown";
		puppy1.display();
		
		Husky puppy2 = new Husky();
		puppy2.name = "Sharik";
		puppy2.color = "Black";
		puppy2.display();
		
		Husky puppy3 = new Husky();
		puppy3.name = "Jack";
		puppy3.color = "Grey";
		puppy3.breed = "Bulldog";
		
		puppy3.display();
		puppy2.display();
		puppy1.display();
	}

}
