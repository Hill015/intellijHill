package com.syntax.class07;

public class whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// I need to print values from 1 to 50 all in 1 line
		
		int a =2;
		
		while (a<=20) {
			
			System.out.println(a);
			a++;
			
		}
		// I need to print values from 1 to 50 all in 1 line
int b=1;
while(b<=50) {
	
	System.out.println(b);
	b++;
	
}
System.out.println("--I need numbers from 20 to 1--");

         int c=20;
         while(c>=1 ) {
        	 
        	 System.out.println(c);
        	 c--;
        	 
        	 
         }
         
         //print only even numbers from 1 to 30
         System.out.println("print even numbers");
         int d=2;
         while(d<=30) {
        	 
         System.out.println(d);
         d+=2;//d=d+2 means
         
         }
    System.out.println("There is another way to print even numbers ");
    int e=1;
    while (e<=30) {
    	if(e%2==0) {
    	
    	System.out.print(e+" ");
    	}
    	e++;
    	
    	
    }
    
	}

}
