package com.class32;

public class WrapperClasses {
	public static void main(String[] args) {
		int num = 10;
		//autoboxing -->converting primitive type into an object type
		Integer integer =100;
		System.out.println(integer.MIN_VALUE);
		String str = integer.toString();
		System.out.println(str );
		
		
		//converting boolean primitive type into boolean object type
		Boolean bool=true;
		byte b =20;
		System.out.println();
		
		
		//Auto unboxing -->converts object type into a primitive type
		int num1 = new Integer (10);
		System.out.println(num1);
		
	}
}
