package com.syntax.class11;

import java.util.Arrays;

public class TaskScanner2dArrayt {

	public static void main(String[] args) {
		// Create a 2D array
		//Print the sum of all numbers
		
		int[][] array2D= {{10,10,10},{20,20,20},{30,30,30}};
		//print out elemnts of an array without a loop
		
		//System.out.println(Arrays.toString(array2D));
		
		//summ all the elements of the array
		
		int sum=0;
		
		for(int x=0; x<array2D.length; x++) {
			
			System.out.println(Arrays.toString(array2D[x]));
			
			for (int y = 0; y < array2D[x].length; y++) {
				sum = sum + array2D[x][y];
			}
		}
		System.out.println("Sum of Array elements is " + sum);
		}
		
		

	}


