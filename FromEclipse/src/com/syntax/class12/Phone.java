package com.syntax.class12;

public class Phone {
	
/*
 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Nokia with specific  attributes and behaviors.
 */
	String brand;
	String model;
	String color;
	String os;
	double price;
	int ram;
	
	void makeCall() {
		System.out.println("Making calls");
		
	}

	 void takePictures() {
		 System.out.println("Take pictures");
		 
	 }
	  
	 void printCompleteInfo() {
		 System.out.println("make "+brand);
		 
		 System.out.println("model "+model);
		 System.out.println("color "+color);
		 System.out.println("operating system "+os);
		 System.out.println("Price "+price);
		 System.out.println("Ram "+ram+" GB");
		 
	 }
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone=new Phone();
		iphone.brand="Apple";
		iphone.model="12";
		iphone.color="black";
		iphone.os="ios";
		iphone.ram=4;
		iphone.price=1000;
		
		
		iphone.printCompleteInfo();
		
		System.out.println("*************");
		
		Phone pixel=new Phone();
		pixel.brand="Google";
		pixel.model="XL";
		pixel.color="white";
		pixel.os="Android";
		pixel.ram=4;
		pixel.price=700;
		
		
		pixel.printCompleteInfo();
		
		System.out.println("*************");
		
		Phone nokia=new Phone();
		nokia.brand="Nokia";
		nokia.model="Nokia3";
		nokia.color="gray";
		nokia.os="Android";
		nokia.ram=2;
		nokia.price=300;
		
		nokia.printCompleteInfo();
		
		
		
		
		
		

	}

}
