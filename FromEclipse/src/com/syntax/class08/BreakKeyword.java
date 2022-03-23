package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){
		
		System.out.println("I am code inside for loop");
		
		
		if (i==3)  {
			
			break;
			
		}	

	}
	
     System.out.println("End of code");
     
     boolean winter=true;
    		 int temp=0;
    		 while(winter) { //(0 +5, 5+5  temp+=5 den dolayı 0 derece 20 olana kadar while loop çalışacak
    			              // 20 olunca break devreye girip its cold yazdırmayı kesecek
    			 
    		 	 System.out.println("It s cold");
    			 if(temp==20) {
    			 
    			 break;
    			 
    		 }
    			 temp+=5;
    			 
  }    
	}
}
