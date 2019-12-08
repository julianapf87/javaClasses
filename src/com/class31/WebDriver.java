package com.class31;

interface TakesScreenshot{
	//public static final
	
	String fileExtension = ".png";
	
	void takesScreen();
	// added from jdk 1.8 
	static void takeSelfies() {
		System.out.println("I am static method of TakeScreenshot interface");	
	
	}
	
	default void takePictures () {
	System.out.println("I am default defined method of TakeScreenshot interface");	
	}
}


interface Application{
	
}

public interface WebDriver extends TakesScreenshot{
	void openBrowser();

	void closeBrowser();

	void maximazeWindow();

	void findElement();
}

abstract class Browser {
	String name;
	
	abstract void refresh();
}

class ChromeDriver extends Browser implements WebDriver {
	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Open Chrome Browser");
	}
	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}@Override
	public void maximazeWindow() {
		// TODO Auto-generated method stub
		
	}
	public void refresh () {
		System.out.println("Refresh Chrome Browser");
	}
	@Override
	public void takesScreen() {
		System.out.println("Take screenshort is Chrome Driver");
	}
	
}
