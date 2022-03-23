package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the 2D array
		// Store even and odd numbers in the 2D array
		
		int[][] array2D= {{2,3,4},{5,6},{12,6,8}};
		
		for (int x=0; x<array2D.length; x++) {
			
			for (int y=0; x<array2D[x].length; y++) {
				
				int element=array2D[x][y];
				
				if (element%2==0) {
					
					System.out.println(element);
					
				}
			}
		}

	}

}
