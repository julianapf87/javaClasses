package com.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * ask user to enter boolean value for sales if no sale --> i am not shopping
		 * ifsale --> check the price of the item based on the amount we will have to
		 * calculate the price after discount if price <20 --> apply 10% 
		 * if price
		 * between 20-100 --> 20% if between 100 - 500 -->30% anything --> 50% After
		 * discount ____ The price of the item reduced from __ to __
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Sale or no Sale? True or False");
		
		boolean sale = scan.nextBoolean();
		
		double price;
		double discount=0;
		double finalPrice=0;
		
		if (!sale) {
			System.out.println("I'm not shopping");
		} else {
			
			System.out.println("Please enter the price of the item");
			double price1 = scan.nextDouble();

			if (price1 < 20) {
				discount = (price1*0.1);
				finalPrice = price1 - discount;
			
			} else if (price1 > 20 || price1 < 100) {
				discount = (price1*0.2);
				finalPrice = price1 - discount;
			
			} else if (price1 >= 100 || price1 < 500) {
				discount = (price1*0.3);
				finalPrice = price1 - discount;
			
			} else if (price1 >= 500) {
				discount = (price1*0.5);
				finalPrice = price1 - discount;
			}
			
			System.out.println("After discount" + discount + " the price of the item reduced from "+ price1 +" to "+ finalPrice);
		}
	}
}
