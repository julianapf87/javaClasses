package com.class26;

class X {
	
	static void display() {
		System.out.println("Class X");
	}
}

class Y extends X {
	static void display() {
		System.out.println("Class Y");
	}
}

class Main {
	  public static void main(String[] args) {
	    
	    Y obj = new Y ();
	   
	    
	    System.out.println("====");
	    
	  }
	}