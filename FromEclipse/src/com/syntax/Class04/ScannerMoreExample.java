package com.syntax.Class04;

import java.util.Scanner;

public class ScannerMoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter your full name ");
		
		// if u need to capture more than 1 word--> use nextLine();
		
		String name=in.nextLine();
		
		System.out.println(name);
		
		

	}

}
