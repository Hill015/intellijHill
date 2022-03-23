package com.syntax.class13;

public class hwMethod5 {
	
	/*
	 * Write a method to return whether given number is prime or not?
	 */
          String PrimeNum (int num) {
        	  if (num>1) {
        		  
        		  for(int i=2;i<num; i++) {
        			  
        			  if(num%i==0) {
        				  return num+" is not prime";
        			  }
        		  }  
        			  }else {
        				  
        				  return num+" is not prime";
        			    
        			  }  
        		  
        	  
			return num+" is prime";
          }
	     
	public static void main (String[] args) {
		
		hwMethod5 prime=new hwMethod5();
	
		
		System.out.println(prime.PrimeNum(5));
		System.out.println(prime.PrimeNum(21));
		System.out.println(prime.PrimeNum(33));
		

	}

}
          

