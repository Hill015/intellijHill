package com.Syntax.Class16;

public class Task3 {
    public static void main(String[] args) {
        // How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
        StringBuilder s=new StringBuilder("This is sentence");






        /**
         * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?
         * ” How would you find out how many sentences are in that String?
         */
            String a="Is it saturday? Is it raining? Do we have a Java Class today?";
            System.out.println(a.length());//String class method karakterleri sayar

        System.out.println(a.split("[?]").length); //length property array içindeki seçili elementi saydı


    }
}
