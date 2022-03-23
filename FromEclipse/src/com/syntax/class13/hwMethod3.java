package com.syntax.class13;

public class hwMethod3 {
	/*
	 * Create a method that will say Hello in different language based on the country that will passed when method is executed.
	 * 
	 */
         String sayHi(String country) {
        	 switch(country) {
        	 case "USA":
        		 return "Hello";
        	 case "Turkey":
        		 return "Merhaba";
        	 case "France":
        		 return "Bomjour";
        		 default:
        	     return " :) ";
        		 
        	 
        	        
        	 }
         }
	public static void main(String[] args) {
		
		hwMethod3 obj=new hwMethod3();
		System.out.println(obj.sayHi("Turkey"));
		

	}

}
