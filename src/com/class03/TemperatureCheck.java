package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		double 	storetemp=40;
		double	desiredtemp=32;
		
		if (desiredtemp<storetemp) {
			System.out.println("Water will freeze with temperature " + desiredtemp);
		}else {
			System.out.println("Water will NOT freeze with temperature " + storetemp);
		}

	}

}
