package com.class29;

public abstract class File {

	public abstract void open();

	public void edit() {
		System.out.println("File can be edited");
	}

	public void close() {
		System.out.println("File can be closed");
	}
}

class JavaFile extends File {
	@Override
	public void open() {
		System.out.println("to open .java file we need notepad++ or sublime text");
	}
}

class WordFile extends File {
	@Override
	public void open() {
		System.out.println("to open .word file we need Microsoft Word");

	}
}

class PDFFile extends File {
	@Override
	public void open() {
		System.out.println("To open .pdf file we need adobe acrobat reader");

	}
}