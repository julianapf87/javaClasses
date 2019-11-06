package com.class11;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		       System.out.println();
		      int []array=new int [5];
		       for(int i=0;i<array.length;i++) {
		       array[i]=scan.nextInt();
		       }
		       for(int a=4;a>=0;a--) {
		           System.out.println(array[a]);
		       }

	}

}
