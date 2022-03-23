package com.syntax.class13;

public class hwMethod2 {
	/*
	 * Create a method that will take a number and prints whether the number is even or odd.
	 */
	
	String evenOdd(int num) {
		if(num%2==0) {
			return num+" is even ";
			
		}else {
			return num+" is odd";
			
		}
	}

	public static void main(String[] args) {
		
		hwMethod2 obj=new hwMethod2();
		System.out.println(obj.evenOdd(11));
		
		
		

	}

}
