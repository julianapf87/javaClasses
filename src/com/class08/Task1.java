package com.class08;

public class Task1 {
	public static void main(String[] args) {
		// Print numbers form 1 to 100 in 1 line with ,

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("********************");
		// Print numbers from 100 to 1

		for (int a = 100; a >= 1; a--) {
			System.out.println(a);
		}
		System.out.println("********************");
		// Print even numbers form 20 to 1 (2 ways)
		for (int q = 1; q <= 20; q++) {

			if (q % 2 == 0) {
				System.out.println(q);
			}
		}
		System.out.println("**********2nd way**********");
		int q = 1;
		while (q <= 20) {
			if (q % 2 == 0) {
				System.out.println(q);
			}
			q++;
		}
		System.out.println("********************");

		// Print odd numbers between 20 and 50 (2 ways)

		for (int d = 20; d <= 50; d++) {

			if (d % 2 == 1) {
				System.out.println(d);
			}
		}
		System.out.println("**********2nd way**********");

		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i);
		}

		System.out.println("**********2nd way**********");

		for (int i = 20; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("**********2nd way**********");

		int r = 20;
		while (r <= 50) {
			if (r % 2 == 1) {
				System.out.println(r);
			}
			r++;
		}
		System.out.println("**********");
		int sum = 0;
		for (int t = 1; t <= 5; t++) {
			sum = sum + t;
			System.out.print(sum + "+");
		}
		System.out.println();
		System.out.println(sum);

		System.out.println("***********************");
		// what is the outpit

		int sumAll = 0;
		for (int i = 0; i <= 20; i += 5) {
			sumAll = sumAll + i;
		}
		System.out.println(sumAll);
		
		/*
		 * 
		 */
		System.out.println("%%%%%%%%%%%%%%%");
		int total =2;
		for (int y=1; y<=3 ; y++) {
			total=total *y;// 1*2 =2 ; 2*2=4 ; 3*4=12
		}System.out.println(total);
	}
}
