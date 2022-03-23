package com.syntax.Class04;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*to auyo complete in mac cmd+shift+o
		 * 
		 */
		
		//1. create a scanner and assign to a variable 
		
		Scanner scan=new Scanner(System.in);
		
		//specify instructions
		System.out.println("please enter country where you are from");
		
		//3 we need to capture String value -->use next();
		
		String country=scan.next();
		System.out.println("You are from "+country);
		
		//if u are from usa--> u speak english
		//if u are from france-->u speak french
		
		if(country.equals("France")) {
			System.out.println("You speak french");
			
		}else if(country.equals("USA")){
		System.out.println("You speak english");
		
			
		}else if(country.equals("Turkey")) {
			System.out.println("You speak turkish");
			
		}else {
			System.out.println("I do not know which language you speak");
			
		}
		// if(country.equalsIgnoreCase("USA"))
		// büyük küçük harf farketmez ignorecase
		
		
	
				

	}

}
