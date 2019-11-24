package com.class19;

public class TestAllMethods {
	// Find the largest number between 300 and 500
	// Then identify if the largest number is odd

	public static void main(String[] args) {

		AllMethods obj = new AllMethods();

		int large = obj.findLargest(300, 500);
		System.out.println(large);

		boolean odd = obj.isOdd(large);
		System.out.println(odd);

		// call method weekDayName
		// if (tuesday, wednesday, thursday, saturday) --> I'm learning Java

		String day = obj.weekDayName(5);
		if (day.equals("Tuesday") || day.equals("Wednesday") || 
				day.equals("Thursday") || day.equals("Saturday")) 
		{
			System.out.println("I'm learning Java");
		}else {
			System.out.println("I am practicing Java");
		}
	}
}