package com.syntax.class12;

public class Horse {                // horse class oluyor
	//attributes,fields ,properties
	String name;
	String breed;
	int age;
	double weight;
	
	//behaviors, methods, and functions we are defining
	
	
	void run() {
		System.out.println(name+" is running");
		
	}
	 void eat() {
		 System.out.println(name+" is eating");
		 
	 }
	 void printCompleteInfo() {
		 System.out.println("name ="+name);
		 System.out.println("breed ="+breed);
		 System.out.println("age ="+age);
		 System.out.println("weight ="+weight);
		 
		 
	 }
	 

	public static void main(String[] args) {
		
		Horse besh=new Horse();
		
		// nesne isimlerini atıyoruz
		
		besh.name="spirit"; // ad atadık
		besh.breed="stallion";
		besh.age=20;
		besh.weight=400;
		besh.run();
		
		besh.printCompleteInfo();
		System.out.println("************");
		
		
		Horse mrAsHorse=new Horse();                //MrAsHorse and besh are objects
		mrAsHorse.name="Tuzik";
		mrAsHorse.breed="Mustang";
		mrAsHorse.age=15;
		mrAsHorse.weight=350;
		mrAsHorse.run();
		
		mrAsHorse.printCompleteInfo();
		
		

	}

}
