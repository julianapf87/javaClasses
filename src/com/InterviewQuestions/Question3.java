package com.InterviewQuestions;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * 3.	Find out how many alpha characters present in a string?
		 */
		
		String a = "Today is sunny";

		System.out.println(a.replaceAll("[^A-z0-9]",  "").length());
		}
		

	}


