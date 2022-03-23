package com.syntax.class10;

public class AllValuesFrom2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
				
		};
		
		int size=numbers.length;
		System.out.println(size);//2D arrayda kaç array oldugunu verdi
		
		int sizeOf1Array=numbers[0].length;
		System.out.println(sizeOf1Array); // 1 array içindeki index sayısı(10,20,30,40) yani 4 
		
	
		// Retrieving all elements from 2D
		
	for (int i =0; i<numbers.length; i++) {
		for(int j=0; j<numbers[i].length; j++) {
			
		
			
			System.out.println(numbers[i][j]);
		}
			
		
		}
		
		

	}

}
