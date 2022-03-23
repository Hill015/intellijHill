package com.syntax.class13;

public class MethodsDemo3 {
	
	//int we specify the datatyoe that method will return void yerinde int 
	//squareTheNumber name of the method
	//(int number) parameters of the method
	
	
	
	int squareTheNumber(int number) {
		return number*number;
		
		
	}

	public static void main(String[] args) {
		
		MethodsDemo3 obj=new MethodsDemo3();
		int result=obj.squareTheNumber(5);
		System.out.println(result);

	}// return çarpma işleminden sonra int result= a gönderir

}
