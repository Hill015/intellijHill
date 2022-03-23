package com.syntax.class10;

public class TaskArrays {

	public static void main(String[] args) {
		
		//create an array and retrieve all elements in reverse order
		
		int[] arr= {10,20,30,40,50,60};
		
		for(int i=0; i<arr.length; i++) {
		
		System.out.println(arr[i]);
		

	}

		
		System.out.println();
		
		for (int i=arr.length-1; i>=0; i--) {
			
			System.out.println(arr[5]);
			
		}
		
		System.out.println("Another way");
		int[] arrs= {45,23,15,10};
		for(int i=0; i<arrs.length; i++) { //length=4
			
			System.out.print(arrs[arrs.length-i-1]+" "); //0= 4-i-1=3 **** i=1--->4-1-1=2 
			                                           
			
		}
	}
}
