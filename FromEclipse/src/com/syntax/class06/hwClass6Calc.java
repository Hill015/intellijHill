package com.syntax.class06;

import java.util.Scanner;

public class hwClass6Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
        * Based on operator provide the result to user.
        */
         //Please complete this assignment in 2 ways: using if statement and switch case.
      Scanner Scan=new Scanner(System.in);
      System.out.println("Enter first number you want to calc.");
      int num1=Scan.nextInt();
      System.out.println("Enter other number you want to calc."); 
      int num2=Scan.nextInt();
      System.out.println("Enter operator +,-,*,/");
      String op=Scan.next();
      
      if (op.equals("+")) {
 System.out.println(num1+num2);     
	} else if(op.equals("-")) {
		System.out.println(num1-num2);
		
	}else if(op.equals("*")) {
		System.out.println(num1*num2);
		
	}else if(op.equals("/")) {
		System.out.println(num1/num2);
	}
      System.out.println("----------");
      
      
      //Scanner Scan=new Scanner(System.in);
      System.out.println("Enter first number you want to calc.");
      int num3=Scan.nextInt();
      System.out.println("Enter other number you want to calc."); 
      int num4=Scan.nextInt();
      System.out.println("Enter operator +,-,*,/");
      String op2=Scan.next();
      
    String res;
      
      switch(op2) {
         
      case "+":
    	  res= "result="+(num3+num4);
    	  break;
      case "-":
    	  res="result="+(num3-num4);
    	  break;
      case "/":
    	  res="result="+(num3/num4);
    	  break;
    	  
      case "*":
    	  res="result="+(num3*num4);
    	  break;
    	  
    	default:
    		res="Error";
    		break;
    		
    	  
      
}
	System.out.println(res);
}
}