package com.syntax.class13;

public class MethodsDemo2 {
	
	//create amethod that takes an animal name and person name if name is equal to Teyfur and animal is Horse
	//print camel otherwise horse
	void TeyfurAndHorse(String PersonName,String AnimalName) {
		if("Teyfur".equalsIgnoreCase(PersonName) && "Horse".equalsIgnoreCase(AnimalName)) {
			System.out.println("This is a camel");
			
		}else if ("Horse".equalsIgnoreCase(AnimalName))
			System.out.println("This is a Horse");
		
	}
	

	public static void main(String[] args) {
		
		MethodsDemo2 obj=new MethodsDemo2();
		obj.TeyfurAndHorse("Teyfur", "Horse");
		obj.TeyfurAndHorse("Tarik","Horse");

	}

}
