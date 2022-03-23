package com.syntax.Class04;

import java.util.Scanner;

public class Class4HwBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible and salary is larger than 50000 than 
		 * bonus = 5000, otherwise bonus=3000
		 */
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter numbers of worked years");
		
		double years=input.nextDouble();
		if(years>=5)
		
		System.out.println("You are eligible for bonus.Now please enter your annual salary.");
		
		else
		
		
		
			
			System.out.println("you are not eligible for bonus");
		
		int salary=input.nextInt();
		
		if(salary>50000)
			System.out.println("you have 5000 bonus");
		else
			System.out.println("you have 3000 bonus");
			
			
		
		
		
	
		
		
		

	}

}
