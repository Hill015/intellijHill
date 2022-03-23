package com.syntax.Class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean vaccine=true;// nested if boolean dogruysa sonrası gerçekleşir 
		// vaccine false olsa diğer durumlar gerçekleşmez
		int dose=1;
		
		if(vaccine) {
			
			System.out.println("How many doses you have ");
			
			if(dose==1) {
				System.out.println("You need another shot");
				
			}else
				
				System.out.println("you are full vaccinated");
			
		}
			/* declare a variable for allergy
			 *  if u have allergy-->
			 *            if u have pollen
			 *            if u have peanut
			 *            if u have wheat
			 *  if no allergy---> u r lucky          
			 */
			
			boolean allergy=true;
			 
			if(allergy) { // outer if
				
				System.out.println("let's check what allergies u have");
				String allergyType="pollen";
				if(allergyType.equals("pollen")) {
					// nested if always has a dependency on outer if
					
					
					System.out.println("please stay at home when blooming");	
				} else if(allergyType.equals("peanut")) {
				System.out.println("please dont eat food that contain nuts");
				
				}else if(allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet.");
				
				}
		}else { // allergy false we will see this condition
			System.out.println("you r lucky");
			
		
		}

	}

}
