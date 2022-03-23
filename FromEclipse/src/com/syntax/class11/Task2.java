package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * write a java to print first 10 fib noumbers
		 * 0,1,2,3,5,8,13,21,34
		 */
		//store the number of fib numbers that we want to produce
		//start from 0 to 1
		
		
		int howMany=10;
		
		int previous=0;   //storing first number and 
		int current=1;
		int next=0;
		
		System.out.print(previous+" ");
		System.out.print(current+" ");
		
		
		for (int i=0; i<howMany-2; i++) {
			
			next=previous+current;
			
			System.out.print(next+" ");
			previous=current;
			current=next;
			
			
		}
		

	}

}
