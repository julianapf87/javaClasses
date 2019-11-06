package com.class10;

public class TaskAnotherWay {

	public static void main(String[] args) {
		
		String[] countries = { "USA", "Italy", "Germany", "France", "Belgium" };
		
		for (int i=0; i<countries.length; i++ ) {
			switch (countries[i]) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Italy":
				System.out.println("Rome");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			case "France":
				System.out.println("Paris");
				break;	
			case "Belgium":
				System.out.println("Brussels");
				break;
			}
		}
// 2d Arrays & Advanced For Loop
		
		
	}

}
