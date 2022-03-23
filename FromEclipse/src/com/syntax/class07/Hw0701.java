package com.syntax.class07;

import java.util.Scanner;

public class Hw0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Declare a variable to store a price for a coffee. Ask user to pay for a coffee. 
		 * Keep asking to pay for coffee until user enters exact amount . 
		 * If user give more than $3 --> ask them to give less, 
		 * if user gives less money then ask to give more. 
		 * Once user got a write amount print “Please enjoy your candy”
		 */
        
		int coffee=3;
		Scanner scan=new Scanner(System.in);
		
		int coffeePrice;
		
		 System.out.println("please pay coffee cost" );
	
           do { 
        	    coffeePrice=scan.nextInt();
        	   if (coffeePrice<coffee) {
        		   System.out.println("please pay more");
        	  
        		   
           }else if (coffeePrice>coffee) {
        	   System.out.println("please pay less");
           
           }      
		
		
	} while (coffeePrice!=coffee);
           System.out.println("Enjoy the coffee");
	
           
           }      
  }

