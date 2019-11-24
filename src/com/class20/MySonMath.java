package com.class20;

public class MySonMath {

	public String name;
	String phone;
	private String SSN;
	protected String birthday;
	
	//public can be seen and access from everywhere
	public void add1() { 

		int num1 = 2;
		int num2 = 1;
		int result = num1 + num2;
	}
	//default can be seen or accessed within the same package
	//and subclasses
	void add2(int num1, int num2) {
		int result = num1 + num2;

	}
	
	//protected can be seen or accessed within package
	protected int add3() {
		int num1 = 2;
		int num2 = 2;
		int result = num1 + num2;
		return result;
	}
	//private can be seen and accessed within the same class
	private int add4(int num1, int num2) {
	
		int result4 = num1 + num2;
		return result4;
	}
	
	private void add5() {
		int resutl =6 ;
	}
}
