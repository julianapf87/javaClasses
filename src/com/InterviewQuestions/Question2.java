package com.InterviewQuestions;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * 2. Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 */
		
		int num[] ={ 900,90,6,7,500,4,600,20,3};
        int largest = num[0];
        int secondLargest = num[1];
        
        for (int i=1; i<num.length; i++)
        {
            if(largest < num[i])
            {
                secondLargest = largest;
                largest = num[i];
            }
            else if(secondLargest < num[i]){
                secondLargest = num[i];
            }
        }
        System.out.println("Largest : " +largest);
        System.out.println("Second Largest : "+secondLargest);
    }
        
}
	


