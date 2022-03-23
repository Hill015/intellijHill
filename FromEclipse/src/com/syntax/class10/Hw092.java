package com.syntax.class10;

public class Hw092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create array on integers and calculate the sum of all elements in an array
		
		int[]  numbers= {15, 45, 10,32 } ;
		
		int size=numbers.length;
		
		int sum=0;
		 for (int i=0; i<size; i++) {
			 sum +=numbers[i];
			 
		 }
               System.out.println("Sum of all elements in the array= "+ sum);
               
	}

}
