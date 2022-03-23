package com.syntax.class12;

public class Dog2 {
	
	/*
	 * Create a Dog Class and create 3 different objects of it:
	 *  Husky, Bulldog, Labrador  with specific  attributes and
	 *   behaviors.
	 */
	   String name;
	   String breed;
	   
	   int age;
	   int weight;
	   double food;
	   
	   
	   void  eat() {
		   
		   System.out.println(name+" eats "+food+" gr.");
		   
	   }
	   void live() {
		   System.out.println(breed+" can live at -60 C degrees");
		   
		   
	   }
	   void printCompleteInfo() {
	   System.out.println("name="+name);
	   System.out.println("breed="+breed);
	   System.out.println("age="+age);
	   System.out.println("weight="+weight);
	  
	   }

	public static void main(String[] args) {
		Dog2 husky=new Dog2();
		
		husky.name="HuskyDog";
		husky.breed="Husky";
		husky.age=4;
		husky.weight=11;
		husky.food=400;
		husky.eat();
		husky.live();
		
		
		husky.printCompleteInfo();
		
		System.out.println("********");
		
		
		Dog2 Labrador=new Dog2();
		
		Labrador.name="Hey";
		Labrador.breed="Labrador";
		Labrador.age=2;
		Labrador.weight=14;
		Labrador.food=500;
		
		Labrador.eat();
		
		Labrador.printCompleteInfo();
		
		System.out.println("******");
		
		Dog2 Bulldog=new Dog2();
		
		Bulldog.name="Hi";
		Bulldog.breed="Labrador";
		Bulldog.age=1;
		Bulldog.weight=9;
		Bulldog.food=300;
		Bulldog.eat();
		
		Bulldog.printCompleteInfo();
		
		
		
		
		

	}

}
