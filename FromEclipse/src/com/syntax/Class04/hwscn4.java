package com.syntax.Class04;

import java.util.Scanner;

public class hwscn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a Java program that will ask if user has a credit card or not. If you user 
		 * does not have a credit card then offer them. If they do have one ask what is balance on 
		 * the card? If balance of the card is larger than 1000, 
		 * tell them to pay off immediately, otherwise you can tell them that they can spend more.
		 */
		
		Scanner input= new Scanner(System.in);
		System.out.println("Do yo have a credit card?");
		
		String card=input.next();
		
		if(card.equals("yes"))
		System.out.println("what is balance on card");
		else
			System.out.println("would you get a credit card?");
		
		int bal=input.nextInt();
		
		if(bal>1000)
		System.out.println("you must pay off it immediately!");
		
		else
			
			System.out.println("you can spend more");
		
		
		

	}

}
