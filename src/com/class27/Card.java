package com.class27;

/*
 * define a class card with 2 methods and this class should have 4 subclasses in which
 * some behavior can be overridden and some can 
 * in its own behavior
 */
public class Card {
	public void interest() {
		System.out.println("Card charges 25% interest");
	}
	public void creditLimit () {//overridden
		System.out.println("Credit limit of the card is 50000");
	}
}

class AX extends Card {

	public void creditLimit () {//overriding method
		System.out.println("Credit limit of the AX card is 25000");
	}
}

class MC extends Card {
	public void creditLimit () {
		System.out.println("Credit limit of the MC card is 15000");
	}
	public void cashBack () {
		System.out.println("MC gives cash bacj of 3%");
	}
}

class Visa extends Card {//overridding method
	public void creditLimit () {
		System.out.println("Credit limit of the MC card is 20000");
	}

}

class Discovery extends Card {
	public void applePay () {
		System.out.println("Discover can take apple pay");
	}
}