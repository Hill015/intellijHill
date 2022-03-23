package com.syntax.class07;

import java.util.Scanner;

public class hw0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ask a user to enter name, last name and age 5 times. 
		 * Every time your program should print those values in a format 
		 * “Your name is _ _ and you are _ years old’
		 */
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Please enter your name, Lastname and age ");
		
	

		String name=scan.next();
		String LastName=scan.next();
         int age =scan.nextInt();
         int num=5;
         
         while(num>=1) {
        	 System.out.println("Your name is "+name+" "+LastName+" and you are "+age+" years old");
        	 num--;
         }
	}

}
