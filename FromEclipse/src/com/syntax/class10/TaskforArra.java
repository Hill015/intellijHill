package com.syntax.class10;

public class TaskforArra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array of countries. while retrieving all values from an array print
		 * capital for each country.
		 */

		String[] countries= {"Germany","Ukraine","Russia","UK","Poland"};
		
		String capital=null;
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			case "Poland":
				capital="Warsaw";
				break;
			case "Germany":
				capital="Berlin";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Russia":
				capital="Moscow";
				break;
			case "UK":
				capital="Londan";
				break;
			}
			System.out.println("The capital of "+countries[i]+" is "+capital);
		}// for u burada kapattık durdurduk
			System.out.println("---Another way-----");
			
			for(String country:countries) {
				if(country.equals("poland")) {
					capital="Warsaw";
					
				}else if(country.equals("Germany")) {
					capital="Berlin";
				}else if(country.equals("Ukraine")) {
					capital="Kiev";
			    }else if(country.equals("Russia")) {
			    	capital="Moscow";
			    }else if(country.equals("UK")) {
			    	capital="London";
			    }
			  
			    System.out.println("The capital of "+country+" is "+capital);
			    
			    	
		}		
					
					
					
				}
				
			
			
	}

				
		
			
		
	


