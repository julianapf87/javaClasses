package com.class28;

/*
 * Write program: suserClass  that has a constructor that initializes name and mobile number istance variables. 
 * Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call. 
 * Print users name, mobile number and address in userDetails method. Test your code.
 */
public class Task {

	String name, mobileNumber;

	Task(String name, String mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

}

class userInfo extends Task {

	String address;
	
	userInfo(String name, String mobileNumber, String address) {
		super(name, mobileNumber);
		
	}
	
	public void userDisplay () {
		System.out.println("The user's name is " + name + " . The phone number is " + mobileNumber + " and the address is "+ address);
	}

}

class userDetails {
	
	public static void main(String[] args) {
		userInfo user = new userInfo("Kyle", "301-123-4566", "101 Constitution Ave.");
		user.userDisplay();		
	}
}
