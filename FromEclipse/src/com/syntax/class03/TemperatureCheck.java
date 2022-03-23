package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp1=28;
		
		
		if(temp1<32) {
			
			System.out.println("water freeze with temperature "+temp1);
			
		}else { System.out.println("Water will not freeze with temperature "+temp1);
		
		}
		
		/*Create Java program to store 2 values for expected and
		 *  actual hours. Your program should check 
           if expected hours are more than  actual the program should print “You will love the course and you will succeed”, 
            otherwise “Course will be very hard for you!“.
		 * 
		 */
		int expHour=3;
		int actHour=5;
		if(actHour>expHour) {
			
			System.out.println("You will love the course and you will succeed");
			
			
		}else { 
			System.out.println("Course will be very hard for you!");
			
		}

	}

}
