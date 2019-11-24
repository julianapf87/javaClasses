package com.class21;

import com.class20.Myself;

public class School {

	public static void main(String[] args) {
		//assigning instance variables
		
		Student.school = "Morning School";
		
		Student student0 = new Student();
		
		student0.displayInfo();
		
		
		Student student1 = new Student();
		student1.studentName = "Erick";
		student1.GPA = 3.95;
		student1.school = "Syntax";
		
		Student student2 = new Student ();
		student2.studentName = "Jaime";
		student2.GPA = 3.90;
		
		
 		
		student1.displayInfo();
		student2.displayInfo();
		student0.displayInfo();
		
		
//		int hours = 3;
//		student1.displayInfo();
//		student1.study(3);
//		student1.displayInfo();

	}

}
