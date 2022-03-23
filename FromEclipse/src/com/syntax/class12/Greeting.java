package com.syntax.class12;

public class Greeting {

	
		
		
			
			void sayHello(String name) {
				System.out.println("Hello " + name);
			}
			void sayHelloManyTimes (String name1) {
				
				for (int i =0; i<5; i++) {
					System.out.println("Hello " + name1);
				}
			}
			
			public static void main(String[] args) {
				
				Greeting greeter = new Greeting();
				
				greeter.sayHello("Hilmi");
				
				
				System.out.println("*****************");
				
				greeter.sayHelloManyTimes("Hilmi");
				
			}
		}

	

