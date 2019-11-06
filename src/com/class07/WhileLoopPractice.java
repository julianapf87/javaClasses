package com.class07;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// how to print numbers form 1 to 20

		int i = 1;
		;

		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		// i want to print numbers from 10 to 30 all in 1 line
		int y = 10;

		while (y <= 30) {
			System.out.print(y + " ");
			y++;

		}
		// how to print values 10 to 1

		int a = 10;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		// print values from 50 to 20
		System.out.println("**************************");
		int b = 20;
		while (b <= 50) {
			System.out.println(b);
			b++;
		}
		// I want to print all even numbers from 1 to 20
		// 1 way - increment value by 2
		int c = 2;
		while (c <= 20) {
			System.out.println(c);
			c += 2;
		}
		// 2nd way using modulus
		System.out.println("*************");
		int q = 2;
		while (q <= 20) {
			System.out.println(".");
			if (q % 2 == 0) {
				System.out.println(q);
			}
			q++;
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// Print only odd numbers from 50 to 100

		int w = 50;

		while (w <= 100) {
			if (w % 2 == 1) {
				System.out.println(w);
			}
			w++;
		}
		System.out.println("#############################");
		// Print only even numbers from 100 to 1
		int e = 1;

		while (e <= 100) {
			if (e % 2 == 0) {
				System.out.println(e);
			}
			e++;
		}
	}
}