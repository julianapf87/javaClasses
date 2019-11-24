package com.class21;

public class Employee {
	
	public int eID;
	public int salary;
	public static String CEO;
	
	public void displayinfo2() {
		System.out.println("Employee: " + eID + ", has a salary of " + salary + ". CEO assigned to: " + CEO);
	}
	public static void main(String[] args) {
		
		Employee emp0 = new Employee();
		
		emp0.displayinfo2();
		
		Employee emp1 = new Employee();
		
		emp1.eID = 2;
		emp1.salary = 57000;
		emp1.CEO = "Sumair";
		
		emp1.displayinfo2();
		
		Employee emp2 = new Employee();
		emp2.eID = 9;
		emp2.salary = 56000;
		
		emp2.displayinfo2();
		

	}

}
