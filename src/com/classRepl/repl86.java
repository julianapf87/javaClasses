package com.classRepl;

public class repl86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
		};
		
		int sum = 0;
		
		for (int[] row:a) {
			for (int abc:row) {
				sum += abc;
			}
			System.out.println(sum);
			sum=0;
			
		}
		
		
//		sum = 0;
//		int row = 0;
//		for (int i=0; i<a[0].length; i++) {
//			sum += a[row][i];
//		}System.out.println(sum);
//		
//		int sum1 = 0;
//		int row1 =1;
//		
//		for (int j=0; j<a[1].length; j++) {
//			sum1+= a[row1][j];
//		}System.out.println(sum1);
//		
//		int sum2 = 0;
//		int row2 =2;
//		
//		for (int r=0; r<a[2].length; r++) {
//			sum2+= a[row2][r];
//		}System.out.println(sum2);
//		
//		int sum3= 0;
//		int row3 =3;
//		
//		for (int q=0; q<a[3].length; q++) {
//			sum3+= a[row3][q];
//		}System.out.println(sum3);
//		
		
	}

}
