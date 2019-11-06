package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int a;// 1st- declare

		a = 10; // 2nd- intialize variable

		int a1 = 10;

		// 1st Way
		int[] b; // 1st step .- declaration of an array--> preferred way

		int c[];
		b = new int[4]; // 2nd step.- create an array of integers

		// 2nd WAY

		int[] array = new int[4]; // this is all in one line
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;

		// How can we access the values from an array?

		System.out.println(array[2]);

		// let create an array that will store classes

		String[] classes = new String[4];
		classes[0] = "Java";
		classes[1] = "SDLC";
		classes[2] = "Manual Testing";
		classes[3] = "GIT";

		// Today we have Java Class
		System.out.println("Today we have " + classes[0] + " class");

		int[] nums = new int[3];

		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;

		// how can i change 1 to 100

		nums[0] = 100;
		System.out.println(nums[0]);
		System.out.println(nums[0] + nums[2]);

		////////////////////////////////
		//The size of an array is fixed
		
		String[] names = new String[5];
		names[0] = "Diana";
		names[1] = "Seda";
		names[2] = "Jaime";
		names[3] = "Olga"; //During run time we get this exception "ArrayIndexOutOfBoundsException"
		
		System.out.println(names [3]);
		
		
		// We ae putting less elements inside
		//-> compiler will give default values
		
		double [] numbers = new double [4];
		numbers [1] = 100;
		numbers [3] = 200;
		
		System.out.println(numbers [0]);
		
		
	}

}
