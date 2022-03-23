package com.syntax.class13;

public class hwMethod4 {
	
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and email type, 
	 * your method should return complete email Address. Example:  createEmail(John,
	 *  Snow, gmail) → johnsnow@gmail.com or 
	 *  
	 */
	   
	   
	   
	   String createEmail(boolean address, String name,String lastname,String mailType) {
		   
		   if (address) {
		 
		   
		   return(name+lastname+mailType);
		   
	   }else {
		   
		   return("unknown");
	   }
		  
		   
	   }
	   

	public static void main(String[] args) {
		
		hwMethod4 mail=new hwMethod4();
		
	    System.out.println(mail.createEmail(true,"hilmi","ozcelik","@gmail.com"));
		

	}

}
