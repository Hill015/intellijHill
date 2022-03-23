package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="saturday";
		
		if(day.equals("saturday") || day.equals("sunday")) {
	
			System.out.println("I have java class");
			
			
		}
System.out.println("code outside of is statement");

   /*let s ask user what is today day
    *  
    *  based on day lets define which class we have 
    *  if(monday or friday)-->there is no class today
    *  else if(teusday or wednesday)-->manual
    *  else if(thursday)-->review class
    *  else if(saturday or sunday)-->java class
    *  
    * 
    */
Scanner input=new Scanner(System.in);

 System.out.println("What is the day today?");
 
 String today=input.next();
 
 if (today.equals("saturday") || today.equals("sunday"))
	 
	 System.out.println("Today is java class");
 
 else if (today.equals("monday") || today.equals("friday"))
	 System.out.println("there is no class");
 
 else if(today.equals("thursday"))
	 System.out.println("today is no class");
 
 else if(today.equals("teusday") || today.equals("wednesday"))
	 
		 
	 System.out.println("today is manual testin class");
	 

		 
 




	}

}
