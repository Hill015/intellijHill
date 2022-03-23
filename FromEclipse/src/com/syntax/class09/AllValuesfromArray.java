package com.syntax.class09;

public class AllValuesfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grade= {'A','B','C','D'};
		//hoe many elements inside array?
		
		int size=grade.length;
		System.out.print("Numbers of elements is = "+size);
		
		
		//System.out.println(grade[2]);
		
		for(int i=0; i<grade.length; i++) {
			
			System.out.print(grade[i]+" ");
			
			
			String[] cities= {"Washington Dc","Miami","Los Angeles","New York",};
			
			for(int a=0; i<cities.length; a++) {
			
			System.out.println(cities[a]+" ");
			
			
		}
	}

}
	
}