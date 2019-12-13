package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUsage {
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Juliana");
		stringList.add("Hasan");
		stringList.add("Saim");
		stringList.add("Yulia");
		stringList.add("John");
		stringList.add("Anna");
		stringList.add("Helen");
		
		//remove names that are shorter thatn 4 characters
		stringList.remove("Hasan");
		System.out.println(stringList);
	
		//removign elements using for loop
		for (int i =0; i<stringList.size(); i++) {
			if (stringList.get(i).length()<=4) {
				stringList.remove(i);
			}
		}
		
		System.out.println(stringList);
		
		//best way to remove an element form a collection will be iterator
		
		List<String> stringList1 = new ArrayList<>();
		stringList1.add("Esra");
		stringList1.add("Juliana");
		stringList1.add("Hasan");
		stringList1.add("Saim");
		stringList1.add("Yulia");
		stringList1.add("John");
		stringList1.add("Anna");
		stringList1.add("Helen");
		
		Iterator<String> it = stringList1.iterator();
		while(it.hasNext()) {
			if (it.next().length()<=4) {
				it.remove();
			}
		}
		System.out.println(stringList1);
	}
	

}
