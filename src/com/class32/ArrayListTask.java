package com.class32;

import java.util.ArrayList;

public class ArrayListTask {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Amaya");
		names.add("Aliah");
		names.add("Amelia");
		names.add("Amara");
		names.add("Angela");
		
		System.out.println("Is arrayList empty? "+names.isEmpty());
		
		//array list can be generic or non-generic
		//Non Generic
		
		ArrayList alist = new ArrayList();
		alist.add("Hello");
		alist.add(100);
		alist.add(10.10);
		alist.add(true);
		alist.add('C');
		
//		System.out.println(alist.get(1) + alist.get(2));
//		System.out.println(alist);
		
		ArrayList <Double> list = new ArrayList<Double>();
		list.add(100.20);
	
	}

}
