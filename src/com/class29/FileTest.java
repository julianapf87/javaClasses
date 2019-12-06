package com.class29;

public class FileTest {
	public static void main(String[] args) {
		
		File file = new JavaFile();
		File file1 = new WordFile();
		File file2 = new PDFFile ();
		
		file.open();
		file.edit();
		file.close();
		
		file1.open();
		file1.edit();
		file1.close();
		
		file2.open();
		file2.edit();
		file2.close();
	}

}
