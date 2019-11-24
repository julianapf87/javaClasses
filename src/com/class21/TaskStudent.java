package com.class21;

public class TaskStudent {

	public String studentName;
	public int studentID;
	public static int numberOfStudents ;
	
	public void info () {
		System.out.println("Student: " + studentName + " with class ID: "+ studentID + " is in a class with " + numberOfStudents++ + " other students");
		
	}
	public static void main(String[] args) {
	 TaskStudent student0 = new TaskStudent();
	 
	 student0.info();
	 student0.numberOfStudents = 4;
	 
	 TaskStudent student1 = new TaskStudent();
	 student1.studentName = "Julie P";
	 student1.studentID = 1;
	 student0.info();
	 
	 TaskStudent student2 = new TaskStudent();
	 student1.studentName = "Melissa";
	 student1.studentID = 2;
	 student0.info();

	}

}
