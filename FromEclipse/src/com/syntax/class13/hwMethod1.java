package com.syntax.class13;

public class hwMethod1 {
	
	String larger(int num1,int num2) {
		
		if(num1>num2) {
			return num1+" is larger";
			
			
		}else {
			return num2+" is larger";
			
			
		}
		
	}

	public static void main(String[] args) {
		
       hwMethod1 obj=new hwMethod1();
       System.out.println(obj.larger(15,12));
       
       

       
	}

}
