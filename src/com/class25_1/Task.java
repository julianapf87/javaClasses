package com.class25_1;

public class Task {

	public void areaRect(int lenght, int width, int height) {
		System.out.println(lenght * width);
	}

	public void areaSquare(int lenght) {
		System.out.println(lenght * lenght);
	}

	public void areaBox(int length, int height) {
		System.out.println(length * height);
	}

	public static void main(String[] args) {

		Task obj = new Task();
		obj.areaRect(3, 4, 6);
		obj.areaSquare(4);
		obj.areaBox(4, 5);
	}

}
