package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
			
			System.out.println("Hello");
			if(i==3) {
				
				continue; //skip current iteration/cycle
				
		
			}
			System.out.println("Hello "+i);
			System.out.println("We are Batch 12");
			
		}
		

	// continue koşulun gerçekleştiği durumu atlayıp loop a devam eder mesela 3 e eşitken atladı yazdırmadı
    
		// --I want to print all numbers from 1 to 10--
		
		for(int i=1; i<=10; i++) {
		if (i==4) {
			continue;
			
		}
		System.out.print(i+" ");
		
  }
}
}