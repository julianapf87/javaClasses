package com.class27;

public class TaskTest {

	public static void main(String[] args) {
		SyntaxStudent ss = new SyntaxStudent();
		ss.study();
		ss.doHomework();
		ss.attendClasses();
		ss.research();
		
		Student student = new Student();
		student.study();
		student.research();
		student.attendClasses();
		//student.doHomework -- not visible because the method in private, and we are in a different class
	}
}
