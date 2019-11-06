package com.class11;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
	
		String [][] names = {
				
				{"Kahn", "Yousu", "Alex", "Zynab"},
				{"Mohammad", "Ann", "Naslyhan", "Weqas"},
				{"Diago", "ASif" , "Zubair", "Shogofa"},
				
		};
		int length = names.length;
		
		int lengthOfRows = names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfCols = names[1].length;
		System.out.println(lengthOfCols);
		
		for (String getArrays[] : names) {
			for (String getName: getArrays) {
				System.out.print(getName + " ");
			}
		}
	}

}
 