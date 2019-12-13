package com.class31;

public abstract class Marks {
	public abstract double getPercentage();

}

class A extends Marks {
	double math;
	double bio;
	double geography;

	public A(double math, double bio, double geography) {
		this.math = math;
		this.bio = bio;
		this.geography = geography;
	}

	@Override
	public double getPercentage() {
		
		double average = (math + bio + geography)/3;
	
		return average;
	}

}

class B extends Marks{

	double math;
	double bio;
	double geography;
//
//	public A(double math, double bio, double geography) {
//		this.math = math;
//		this.bio = bio;
//		this.geography = geography;
//	}

	@Override
	public double getPercentage() {
		
		double average = (math + bio + geography)/3;
	
		return average;
	}
}