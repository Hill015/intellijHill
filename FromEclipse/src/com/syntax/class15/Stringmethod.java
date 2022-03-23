package com.syntax.class15;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //substring seçili indexten sonuna kadar yazar 
		/*
		 * Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the Strin
		 */
		
		String str="Hello";
		if(str.length()%2!=0&& str.length()>=3) {
			System.out.println(str.charAt(str.length()/2));
			
		}
	}

}
