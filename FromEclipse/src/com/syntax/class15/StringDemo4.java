package com.syntax.class15;

public class StringDemo4 {

	public static void main(String[] args) {
		
		/*
		 * write a program that reads two people's first
	names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
		 */
		String	mother= "Mary";
		String	father= "Daniel";
		String expectation="boy";
		String firstPart="";
		String secondPart="";
			if (expectation.equalsIgnoreCase("boy")) {
				
	              firstPart=father.substring(0,father.length()/2);
	              secondPart=mother.substring(0,mother.length()/2);
	              
		
			}else if(expectation.equalsIgnoreCase("girl")){
				
				
	              firstPart=mother.substring(0,mother.length()/2);
	              secondPart=father.substring(0,father.length()/2);
				
				
				
			}
			System.out.println(firstPart+secondPart);
			
		}

	}


