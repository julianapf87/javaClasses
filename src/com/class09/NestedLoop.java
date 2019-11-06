package com.class09;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) { // outer loop control repetition of inner loop

			System.out.println("Im an outer loop");

			for (int j = 1; j <= 3; j++) {
				System.out.println("Im an inner loop");
			}
		}

	}

}
