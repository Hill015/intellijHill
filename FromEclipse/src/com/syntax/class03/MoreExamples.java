package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		
		/* we need to declare a boolean variable
		 *hungry yes or no
		 *if we hungry-->ı am going to eat
		 *otherwise--> ı am going to drink a tea 
		 */
		
		boolean hungry=false;
		
		if(hungry==true) {
			
			System.out.println("I am going to eat");
			
			
			
		} else {
			
			System.out.println("I am going to drink tea");
			
		}
		
		boolean traffic=true;
		
		if(traffic) {
			
			System.out.println("I am coming home late");
			
			
		}else {
			System.out.println("I will be at home on time");
			
		}
		
		/*dedine a variable to store a browser
		 * if browser is chrome-->we are eecuting the test on chrome
		 * otherwise -->ı am not executing any test cases
		 */
		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("we are executing tests on chrome");
			
		} else {
			System.out.println("ı am not executing any test cases");
			
		}
   // (___.equals) use wiht string
	// also use if(browser=="chrome") too but not preffered
		
	}

}
