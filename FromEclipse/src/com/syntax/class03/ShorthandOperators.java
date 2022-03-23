package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// + , - , * / , %
		/*
		 *shorhand operators işlemi olanı kullanarak kısaltmak 
		 *için kullanılır.
		 */
		
		
		
        int num=100;
        num=num+100;
        
        System.out.println(num);
        
        num+=100; //this means num=num+100
        System.out.println(num); //300
        num-=20;
        System.out.println(num);//280
        num/=10;// shorter way of num=num/10
        System.out.println(num);// 28
        
        
        num%=3;
        System.out.println(num);//1 28/2 den kalan
        
        int value=200;
        value=value+100;
        value+=100;// value 300 iken +100 400 oldu
        System.out.println(value);
        
        		
       //
    
        
        

         
	}

}
