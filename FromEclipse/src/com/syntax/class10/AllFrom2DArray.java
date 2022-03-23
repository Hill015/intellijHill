package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] food= {
				
				{"redbull","burger","steak","fries"},
				{"curry","biriyani","butter chicken"},
				{"noodles","pad thai","tom yum"},
				{"pizza","pasta"}
				
		};
		
		//her satırı dizini tekrar eder array and row
		for(int row=0; row<food.length; row++) {
			
			//her sıranın sütununu tekrara eder 
			
		for (int col=0; col<food[row].length; col++) {
				
				
			}System.out.println(food[2][1]);
		}

	}
}


