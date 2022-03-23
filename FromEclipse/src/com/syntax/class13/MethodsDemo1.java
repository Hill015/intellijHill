package com.syntax.class13;

public class MethodsDemo1 {
	
	 void checkEvenOdd (int number){
		 
	 if (number%2==0) {
		 System.out.println("even");
		 
	 }else {
		 System.out.println("Odd");
		 
	 }
	 
	 }
	 void weather(boolean isRaining) {
		 if(isRaining) {
			 System.out.println("i am staying at home");
			 
		 }else {
			 System.out.println("lets go for a walk");
			 
		 }
	 } 
	 void checkPerson (String name) {
		 
		 if("Teyfur".equals(name)) {
			 System.out.println("memer");
			 
		 }else if ("Maha".equalsIgnoreCase(name)) {
			 
			System.out.println("Doctor");
			
			 
		 }else {
			 System.out.println("unknown");
			 
		 }
			 
	 
}
	public static void main(String[] args) {
		
		MethodsDemo1 object1=new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.weather(false);
		object1.checkPerson("Teyfur");
		object1.checkPerson("maha");
		
		

	}

}
