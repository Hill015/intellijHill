package com.syntax.class09;

public class TaskArray {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
         
		
		char[] grades={'A','B','C','D'};
		
		System.out.println(grades[0]);
		
		char[] grades1=new char[4];
		
		grades1[0]='A';
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		
		System.out.println("My grade is "+grades1[0]);
		
		
		
		String[] names= {"Ali","Ronaldo","Pele","Hagi"};
		
		System.out.println("The best is "+names[3]);
		
		
		/* Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”. 

		 * 
		 */
		
		
	}

}
