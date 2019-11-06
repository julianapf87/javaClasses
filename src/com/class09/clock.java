package com.class09;

public class clock {

	public static void main(String[] args) {
		// 24 hrs, 60 minutes

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}
			}
		}
		System.out.println("-----------------------------------------");

		for (int h = 0; h <= 12; h++) {
			for (int m = 0; m < 60; m++) {
				if (m < 10) {
					System.out.println(h + ":0" + m + " am");
				} else if (h == 12) {
					System.out.println(h + ":" + m + " pm");
				} else {
					System.out.println(h + ":" + m + " am");
				}
			}
		}
		for (int h = 1; h < 12; h++) {
			for (int m = 0; m < 60; m++) {
				if (m < 10) {
					System.out.println(h + ":0" + m + " pm");
				} else {
					System.out.println(h + ":" + m + " pm");
				}
			}
		}

	}
}