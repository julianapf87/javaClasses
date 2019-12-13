package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	String name;
	int studentId;

	public Student(String name, int studenId) {
		this.name = name;
		this.studentId = studenId;
	}

	public void display() {

		System.out.println("My name is " + name + " my student ID is " + studentId);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// create an array list that will store student type of objects

		List<Student> students = new ArrayList<>();
		Student stu = new Student("John",101);
		Student stu1 = new Student("Jane",102);
		Student stu2 = new Student("Jack",103);
		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//display info of each student
		
		stu.display();
		System.out.println(stu.name);
		System.out.println(stu.studentId);
		stu1.display();
		//for each loop
		System.out.println("--- For each loop ---");
		for (Student student : students) {
			student.display();
			
		}
		//addign more objects of a Student type
		students.add(new Student("Michael", 104));
		students.add(new Student("David", 105));
		students.add(new Student("Esra", 106));
	
		System.out.println("--- Using iterator ---");
		//Display info of each student using iterator
		
		Iterator<Student> myIterator = students.iterator();
		while (myIterator.hasNext()) {
			myIterator.next().display();
		}
	}
}
