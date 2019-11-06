package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// Declare 2D Array

		int[][] array = new int[3][4];// 3 rows and 5 columns

		// 1st Row
		array[0][0] = 45;
		array[0][1] = 80;
		array[0][2] = 33;
		array[0][3] = 20;

		// 2 row
		array[1][0] = 10;
		array[1][1] = 5;
		array[1][2] = 7;
		array[1][3] = 8;

		// 3 row
		array[2][0] = 10;
		array[2][1] = 9;
		array[2][2] = 70;
		array[2][3] = 6;

		System.out.println(array[2][1]);

		// task: create a 2D array of String with 2 and 3 columns.

		String[][] array1 = new String[2][3];

		array1[0][0] = "Hi";
		array1[0][1] = "Hola";
		array1[0][2] = "Hello";

		array1[1][0] = "Hello";
		array1[1][1] = "World";
		array1[1][2] = "!!!";

		System.out.println("++++");
		int[][] numbers = { 
				{ 8, 7, 65, 3, 8 },
				{ 1, 5, 6, 4, 9 }, 
				{ 3, 6, 8, 0, 7 }, };
		System.out.println(numbers[1][4]);

		// To identify the numbers of rows
		System.out.println("The number of rows are " + numbers.length);

		// To identify the numbers of columns or the number of elements in the row
		System.out.println("The number of columns are " + numbers[1].length);		
		
		for ( int i =0; i <numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++ ) {
				System.out.print(numbers [i][j] +" ");
			}
			System.out.println();
		}
		
		
	}

}

//
//System.out.println(“***********“);
//int [][] numbers= {
//        {8,7,5,3,8},
//        {1,5,6,4,9},
//        {3,6,8,0,7},
//        
//};
//
////System.out.println(“The value in index 1 and 4 is= “+numbers[1][4]);
//
////To identify the numbers of Rows
//System.out.println(“The numbers of Arrays are:= “+numbers.length);
//
////To identify the numbers of Columns/elements in a row
//System.out.println(“The numbers of Columns are:= “+numbers[1].length);
//System.out.println(“============“);
//System.out.println();
//
//for(int i=0;i<numbers.length;i++) {
//    for(int j=0;j<numbers[i].length;j++) {
//        System.out.println(numbers[i][j]+” “);
//    }
//}
