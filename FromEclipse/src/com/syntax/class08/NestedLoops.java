package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		
		System.out.println("----CAR MILAGE-----");
	
		for(int a=0; a<=9; a++)  {
			
			for(int b=0; b<=9; b++) {
				
				for(int c=0; c<=9; c++) {
					
					System.out.println(a+" "+b+" "+c);
				}
			}
			
			
		}
		
		//yukarıdan aşagı kosul baslatıldı son loop bitene kadar devam etti

	}

}
