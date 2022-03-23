package com.syntax.Class04;

import java.util.Scanner;

public class HwClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
	 * If loan is less or equal to 200,000 then you would lend the money 
	 * otherwise you would reject the client.
	 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter how much loan you ask");
		
		int loan=input.nextInt();
		
		if(loan<=200000)
		
		System.out.println("acceptable amount you are aligible");
		
		else
			 System.out.println("You are not eligible fo loan");
		
	
	
	/*You are DMV representative and you need to ask customer their age. 
	 * If they are 18 and older you will issue a driver license to them, 
	 * otherwise you will offer them to get a learners permit.
	 */

	
	Scanner input2=new Scanner(System.in);
	
	System.out.println("how old are you?");
	
	int age=input2.nextInt();
	if(age>=18) 
		System.out.println("You can get a driver licence");
	else
		System.out.println("You shoul get learners permit");
	

	
	
	
	}
}
		
		
		  
			
		  
		
		
	
	

			  
			  
	
	
	

  
	

		
		
	
	

