package com.class25;

public class Test {
	
	public static void main(String[] args) {
	
		System.out.println("Create and object of an employee class");
		Employee emp = new Employee();
		emp.salary = 70000;
		Employee.companyName = "Syntax";
		emp.getPaid();
		
		System.out.println("Creating an object of Scrum Team");
		
		ScrumTeam sm = new ScrumTeam();
		sm.salary = 90000;
		sm.work();
		sm.getPaid();
		sm.artifacts = "Product Backlog, Sprint Backlog, BurnDownChart";
		sm.ceremonies= "Sprint Demo, Planning, Retro, Daily standup";
		sm.attendsScrumMeetings();
		
		Developer dev = new Developer();
		dev.salary = 130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts = "Sprint Backlog";
		dev.ceremonies =  "Sprint Demo, Planning, Retro, Daily standup";
		dev.attendsScrumMeetings();
		
		
	}

}
