package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=10;
		
		//widening or implicit
		//we store int value 10 inside double variable
		
		double d=10;
		System.out.println(i); //10
		System.out.println(d); //10.0
		
		//int num=10.0;//Type mismatch:cannot convert from double toint
		
		//narrowing or explicit casting
		//we store double value 10.99 into int variable
		
		int num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f; // type mismatch:cannot convert from double to float
		System.out.println(f);
		
		

	}

}
