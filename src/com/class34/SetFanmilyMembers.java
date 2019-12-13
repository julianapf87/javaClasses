package com.class34;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFanmilyMembers {

	public static void main(String[] args) {
		
	
	Set <String> fruitSet = new LinkedHashSet<>();
	fruitSet.add("Apple");
	fruitSet.add("Banana");
	fruitSet.add("Kiwi");
	fruitSet.add("Grape");
	fruitSet.add("Pinnaple");
	fruitSet.add("Banana");
	
	System.out.println(fruitSet.size());
	System.out.println(fruitSet);
	
	//create a collection that wont allow duplicates
	//and sorts objects in ascendign order
	Set <Integer> tset = new TreeSet<>();
	tset.add(200);
	tset.add(2000);
	tset.add(20);
	tset.add(99);
	tset.add(0);
	tset.add(999);
	tset.add(0);
	System.out.println(tset.size());
	System.out.println(tset);
	
	Set <String> linkedSet = new LinkedHashSet<>();
	linkedSet.addAll(fruitSet);
}
}
