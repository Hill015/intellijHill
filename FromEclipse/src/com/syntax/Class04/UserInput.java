package com.syntax.Class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);//creating a Scanner
		
		System.out.println("Please enter your name");
		
		//if u want to capture single String-->use next();
		
		String name=input.next();// String i yaz ve enter
		
		System.out.println(name);

		System.out.println("My name is "+name);
		
		
		// if u want capture in--> use nextInt();
		
		System.out.println(name+" please enter your age");
		
		int age=input.nextInt();//type integer and hit enter
		
		System.out.println("your name is "+name+" and your age is "+age);
		
		
		
		

	}

}
