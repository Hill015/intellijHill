package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("----WHILE CHECK CONDITION BEFORE EXECUTION----");
	int num=10;
	
	while(num<=5) { // is more used than do while
		
		System.out.println("Hello");// 5 times 
		num++;
		
	}
	System.out.println("---do whıle check condıtıon after execution");
	int num1=10;
	
	do { 
		System.out.println("Hello");
		
	} while(num1<=3);
	System.out.println("I want to print numbers from 1 to 30 using do while loop");
	
	int a =1;
	 do {
		 System.out.println(a+" ");
		 a++;
	 } while(a<=30);
	 


	}

}
