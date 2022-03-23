package com.syntax.class11;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a java to check wheter a given number is prime or not?
		// if number is not greater than 1 it is not prime
		
		
		
		int number=5;
		boolean isPrime=true;
		
		if (number>1) {
			
			for(int i=2; i<number; i++) {
				
				if(number%i==0) {
					 isPrime=false;
					 break;
					 
				}
			}
			
			
		}else {
			
			isPrime=false;
			
		}
		System.out.println(number+" isPrime "+isPrime);
		
		
		

	}

}
