package com.class31;

public abstract class Marks {
	public abstract void getPercentage();

}

class A extends Marks {
	int score;
	int percentage;

	public A(int score1, int score2, int score3) {
		this.score = score;
		this.percentage = percentage;
		score = score1 + score2 + score3;

	}

	@Override
	public void getPercentage() {
		System.out.println((score / 300) * 100);

	}

}

class B {

}