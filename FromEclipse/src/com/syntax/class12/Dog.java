package com.syntax.class12;

public class Dog {

	
		// attributes, fields,properties
		String name;
		String color;
		String breed;
		char gender;
		int age;
		double weight;
		double food;
		
		
		//behaviors, functions and methods void davranışları belirlemek için kullanılır
		void bark(){
			
			System.out.println("Dog is barking...");
			
		}
		void eat() {
			
			System.out.println("Dog is eating");
			
		}
          void sleep ( ){
        	  
        	  System.out.println("Dog is spleeping");
        	  
          }
          public static void main(String[] args) {
        	//creating an object scooby from class Dog  
        	  Dog scooby=new Dog();
        	 //Dog is a class
        	  //scooby is an object
        	  //= is an assignment operator
        	  //new is keyword that we use to create the objects of a class
        	  //Dog() we are calling the constructor of the class
        	  // scanner scan =new Scanner(System.in);
        	  scooby.bark();
        	  scooby.eat();
        	  scooby.sleep();
        	  
	}
		public void printCompleteInfo() {
			// TODO Auto-generated method stub
			
		}
		public void live() {
			// TODO Auto-generated method stub
			
		}
	

}
