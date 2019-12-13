package com.class34;

import java.util.LinkedList;
import java.util.List;

class Sweets {
	String name;

	public Sweets(String name) {
		this.name = name;

	}

	public void iLove() {
		System.out.println("I love " + name);
	}
}

public class LinkedListDemo2 {
	public static void main(String[] args) {
		// create a list of sweets objects

		LinkedList<Sweets> sweetList = new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));

		// lets display name of each sweet object

		for (Sweets elements : sweetList) {
			System.out.println(elements.name);
			elements.iLove();
		}

		// retrieving 1 element and accessing method (2 steps)
		Sweets mySweets = sweetList.get(2);
		mySweets.iLove();

		// retrieving 1 element and accessing method (2 steps)
		sweetList.get(2).iLove();

		String nameOfTheSweet = sweetList.get(2).name;
		System.out.println(nameOfTheSweet);

		String str = "Hello 123";
		str.replace("123", "456").trim();

		//
		Integer num = 100;
		Integer newNum = num.toString().replace("100", "200").length();
		System.out.println(newNum);
	}

}
