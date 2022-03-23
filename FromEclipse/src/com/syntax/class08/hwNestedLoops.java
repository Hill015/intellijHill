package com.syntax.class08;

public class hwNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
					//*********
					
					for (int i = 0; i <= 23; i++) {

						for (int j = 0; j <= 59; j++) {

							if (i < 10 && j < 10) {
								System.out.println("0" + i + " : " + "0" + j);	
							} else if (i < 10) {
								System.out.println("0" + i + " : " + j);
							} else if (j < 10 && i >= 10) {
								System.out.println(i + " : " + "0" + j);
							} else {
								System.out.println(i + " : " + j);
							}

						}

	}

			}

	}    // time="0"+h"+:"+m şeklinde de dene 
