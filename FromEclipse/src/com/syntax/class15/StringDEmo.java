package com.syntax.class15;

public class StringDEmo {

	public static void main(String[] args) {
	
		String userName="LILLY";
		String password="Lilly123";
		
		if("Lilly".equals(userName)&& "Lilly123".equals(password)) {
			System.out.println("Welcome back");
			
		}else {
			
			System.out.println("Username or password is not correct");
			
		}
		
		if ("Lilly".equalsIgnoreCase(userName)&& "Lilly123".equals(password)) {
			System.out.println("Welcome back");
			
		}else {
			
			System.out.println("Username or password is not correct");
			
		}
	}

}
