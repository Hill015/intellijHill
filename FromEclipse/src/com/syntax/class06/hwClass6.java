package com.syntax.class06;

import java.util.Scanner;

public class hwClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent,
		 *  B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered by a user with explanation.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		
		String grade=scan.next();
		String reply;
		      switch(grade.toUpperCase()) {
		       case "A":
		       reply="Excellent";
		       break;
		       case "B":
		       reply="Good";
		       break;
		       case "C":
		       reply="Average";
		       break;
		       case "D":
		       reply="Bad";
		       break;
		       default:
		    reply="Not acceptable";	   
		       		}
 System.out.println("Your grade is "+reply);
}
}