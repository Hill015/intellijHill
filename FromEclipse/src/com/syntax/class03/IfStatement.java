package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * I need to compare 2 number and I have to find which is bigger
		 */
		int num1=100;
		int num2=50;
		
		if (num1>num2) {
			System.out.println(num1 +" is larger than "+num2);
		}// if cond dan sonra yeni {} blok of code açılmalı
		// if statement dogru değilse java çalışmaz
		
		double money=5;
		double coffee=4.99;
		
		// if I have more money than price of coffee----> Iam buuin coffee
		
		if (money>coffee) {
			System.out.println("I am buying coffee");
// if(money=coffee) Error because if condition
// must be boolean 
// if(money>=coffee) and made both 5 it be true
			
		}

	}

}
