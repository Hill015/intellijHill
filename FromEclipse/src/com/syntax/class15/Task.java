package com.syntax.class15;

public class Task {

	public static void main(String[] args) {
		String userName="";
		String password="";
		String confirmedPassword="";
		
		if(!userName.isEmpty() || !password.isEmpty()) {   // means not empty
			
			
		}else {
			System.out.println("Username and password not be empty");
			
		}
		if(password.length()<8) {
			System.out.println("Password is too short");
		}else {
			if(password.contains(userName)){
				System.out.println("Password cannot contain username");
			}else {
				if(password.equals(confirmedPassword)) {
					System.out.println("Your username and password has been created");
				}else {
					System.out.println("Passwords do not match”");
				}
	}

		}
	}

	public void checkUserNamePassword(String userName, String password, String confirmedPassword) {
		// TODO Auto-generated method stub
		
	}
}
	
