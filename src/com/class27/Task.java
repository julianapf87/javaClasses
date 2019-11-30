package com.class27;

/*
 * Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 

Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Task {
	public static void main(String[] args) {
		
		Student [] arrayStudent = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
		for (Student student : arrayStudent) {
			student.study();
		}
		
		
		System.out.println("++++++++++");
		CollegeStudent obj = new CollegeStudent();
		obj.schoolHours();
		obj.graduation();
		System.out.println("++++++++++++++");
		
		SchoolStudent obj1 = new SchoolStudent();
		obj1.schoolHours();
		obj1.study();
		obj1.recess();
		
		System.out.println("++++++++++++++");
		Student obj2 = new Student();
		obj2.study();
		
		
		System.out.println("++++++++++++++");
		SyntaxStudent obj3 = new SyntaxStudent();

		obj3.study();
		
	}
	
}

class Student {
	
	public void study () {
		System.out.println("Student need to study");
	}
	
	private void doingHomework () {
		System.out.println("Student need to do homework");
	}
	
	protected void research () {
		System.out.println("Student need to do research");
	}
	
	void attendClasses () {
		System.out.println("Student need to attend classes");
	}
	
}

class SyntaxStudent extends Student {
	
	public void study () {
		System.out.println(" Syntax Student need to study");
	}
	public void research () {
		System.out.println("Syntax Student need to do a lot of research");
	}
	
	protected void attendClasses() {
		System.out.println("Syntax Student need to attend all classes");
	}
	// we are not overriding, child class have its own method doHomework();
	public  void doHomework () {
		System.out.println("Syntax Student need to do homework");
	}
}

class CollegeStudent extends Student {
	public void schoolHours () {
		System.out.println("College students have to study monday thru friday");
	}
	
	public void graduation() {
		System.out.println("College students  all attend graduation");
	}
}

class SchoolStudent extends Student {
	public void schoolHours () {
		System.out.println("School students have to study only when they are in school");
	}
	public void recess(){
		System.out.println("School students  get recess in the middle of their classes");
	}
}