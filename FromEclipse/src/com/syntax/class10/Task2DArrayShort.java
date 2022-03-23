package com.syntax.class10;

public class Task2DArrayShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            /*Create a 2D array(shorter way) in which first array will consist of 4 names
             *  and second array will contain grades. Then your program should print name of 
             *  the students that has A and B grade
             * 
             */
		String [][] studentg= {
				{"Elon","Alex","Gustavo","Olivia"},
				
				{"A","B","C","D"}
				
		};
		
		System.out.println(studentg[0][2]+" "+studentg[1][0]);
		System.out.println(studentg[0][1]+" "+studentg[1][1]);

	}

}
