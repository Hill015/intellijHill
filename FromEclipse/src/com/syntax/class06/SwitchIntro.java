package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=0;
		String dayName;
		//default value off non primitive types is
		//--->null
		if (day==1) {
			
			dayName="monday";
			
		}else if(day==2) {
			dayName="tuesday";
			
		}else if(day==3) {
			dayName="wednesday";
			
		}else if(day==4) {
			dayName="thursday";
			
		}else if(day==5) {
			dayName="Fridaly";
			
		}else if(day==6) {
			dayName="saturday";
			
		}else if(day==7) {
			dayName="sunday"; 
		}else 
				dayName="Invalid";
			System.out.println(dayName);
			System.out.println("----------");
			
			switch(day) {
			case 1:
				dayName="Monday";
				break;
			case 2:
				dayName="Tuesday";
				break;
			case 3:
				dayName="Wednesday";
				break;
			case 4:
				dayName="Thursday";
				break;
			case 5:
				dayName="Friday";
				break;
			case 6:
				dayName="Saturday";
				break;
			case 7:
				dayName="Sunday";
				break;
			default:
				dayName="Invalid";
				break;
				
			}
			System.out.println(dayName);
		

	

}
}
