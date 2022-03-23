package com.syntax.Class04;

import java.util.Scanner;

public class hwScannerClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*reate a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * “The temperature is the city __ is __”
		 */
        
		Scanner input=new Scanner(System.in);
		
	     System.out.println("Please type your city");
	     
		
		String city=input.next();
		
		System.out.println("please type temp in fahrenheit ");
		int temp=input.nextInt();
	     
int celc=temp-32;

     System.out.println("The temperature is the city "+city+" is "+celc+" celcius ");
		
	}

}
