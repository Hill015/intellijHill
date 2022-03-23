package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=50;
		
		//which number is largest
		
		if (num1>num2 ) { 
			System.out.println(num1 +" is larger than "+num2);
		}else { System.out.println(num2+" is larger than "+num1);
		
		}
		int temp=45;
		// if temp is more than 45--> im going for a walk
		// otherwise --> ı am staying home
		
		if (temp>=45) { 
			System.out.println("I am going for a walk");
			
		}else 
			System.out.println("I am staying at home");
		
           /* I need variable that store a gender
            * if gender is f--->please use front of the train
            * otherwise ------> please use back of train
            * 
            */
		char gender='f';
		if (gender=='f') {
			System.out.println("please use front of train");
			
			
		}else { 
			System.out.println("please use back of the train");
			
		}
		
	}

}
