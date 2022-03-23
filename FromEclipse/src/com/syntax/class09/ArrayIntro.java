package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		
		//creating an array that holds 4 elements
		
		int[] numbers=new int[4];
		
		//storing values/elements inside an array
		
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		System.out.println(numbers[0]);
		
		System.out.println(numbers[3]+numbers[0]); // made addition
		
		
		//I want to create an array of countries
		
		String[] countries=new String[5];
		
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		System.out.println(countries[3]+countries[1]);
		
		String[] names=new String[5];
		names[1]="Orsan";
		names[2]="Gulnar";
		names[3]="Zakirullah";
		
		System.out.println(names[1]);
		
		
		//Create an array to store 4 different prices
		//find an average of how much we spent 
		
		double[] prices=new double [4];
		
          prices[0]=12.99;
          prices[1]=17;
          prices[2]=19;
          prices[3]=36;
          
          System.out.println((prices[1]+prices[0]+prices[2]+prices[3])/4);
          
		
		
		
		
		

	}

}
