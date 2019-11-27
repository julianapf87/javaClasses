package com.class26;

public class FullTime extends Employee {
	int bonus;

	public void getPaid () { // we are overriding the previous method
	System.out.println("Full time employee gets paid " + salary + " and bonus" + bonus);
	}

}
