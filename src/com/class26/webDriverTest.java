package com.class26;

public class webDriverTest {
	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.refresh();
		chrome.open();
		System.out.println("=========");
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		System.out.println("=========");
		
		webDriver driver = new FirefoxDriver();
		driver.open();
		driver.refresh();
		//no acces to chold specific class through parent type
				

	}
}
