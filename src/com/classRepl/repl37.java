package com.classRepl;

import java.util.Scanner;

public class repl37 {

	public static void main(String[] args) {
		/*
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?" "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=Water If user is thirsty and
		 * sleepy--> drink=Coffee If user is not thirsty and sleepy --> drink=Tea
		 * Otherwise drink="Nothing"
		 * 
		 * Output: "Looks like you need ___ "
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Are you thirsty?");
		boolean info1=scan.nextBoolean();
		System.out.println("Are you sleepy");
		boolean info2=scan.nextBoolean();
		String drink;
		
		if ((info1)&& (!(info2))) {
		drink = "water";	
		}else if ((info1)&& (info2)){
		drink = "coffee";
		}else if ((!(info1))&& (info2)) {
		drink = "tea";
		}else {
			drink = "nothing";
		}
		System.out.println("Looks like you need " + drink);
	}

}
