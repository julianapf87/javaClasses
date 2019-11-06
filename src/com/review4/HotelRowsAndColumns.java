package com.review4;

public class HotelRowsAndColumns {

	public static void main(String[] args) {
		// 4 floors and 6 rooms
		// 1.1 1.2 1.3 1.4 1.5 1.6
		// 2.1 2.2 2.3 2.4 2.5 2.6
		// 3.1 3.2 3.3 3.4 3.5 3.6

		for (int floor= 1; floor < 4; floor++) {
			System.out.print("Floor" + floor+ "->" );
			for (int room = 1; room <7; room++) {
				
		System.out.print(floor + "." + room + " ");
		//	System.out.print(room +" " );	
			}System.out.println();
		}	
		
	}

}
