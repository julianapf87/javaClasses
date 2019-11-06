package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int 	num1=20;
		int		num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("********************");
		
		double 	d=1.99;
		double	d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		System.out.println(b1);
		
		boolean c1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		
		System.out.println(c1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("***************************");
		
		int	a=90;
		int f=300;
		//if number a is bigger than number b
		//i want to print a is larger than b
		if (a>f) {
			System.out.println("a is larger than f");
		} else {
			System.out.println("a is smaller than f");
		}
		
		System.out.println("##############");
		
		int	 	expectedhours=15;
		int 	actualhours=20;
		//if expected hours are more than actual, you will succeed.
		// Otherwise, please study more. 
		
		if (actualhours>expectedhours) {
			System.out.println("you will succeed");
		}else {
			System.out.println("please study more");
		}
	
		double 	teaPrice=4.99;
		double	allowedPrice=5.99;
		
		teaPrice-=2;//The price was 4.99 and we subtract 2, the total tea price is 2.99; so the condition is true. 
	
		if (allowedPrice>=teaPrice) {
			System.out.println(" I will buy tea");
			System.out.println("and I will enjoy my tea");
		}else {
			System.out.println("I cannot afford, I need to study more");
			System.out.println("I will go back to study more");
		}
	
		System.out.println("I keep writing some code");
		System.out.println("I keep writing more code");
		
		
		boolean val=false;
		if (val){ //if val==true
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}

		boolean isRain=true;
		//if it is raining I will take an umbrella
		//Otherwise I'd go for a walk
		
		if(isRain) { //isRain==true
			System.out.println("If it is raining I will take an umbrella");
		}else {
			System.out.println("Otherwise, I'd go for a  walk");
		}
		
			
	
	}			
	}

