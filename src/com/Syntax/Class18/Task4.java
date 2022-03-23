package com.Syntax.Class18;

import java.sql.SQLOutput;

public class Task4  {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.
    //** static methods can acces other static methods and fields without needing an object of that class
    // or the class name if they are inside the same class

       private static String onlyVowels(String input){
           return input.replaceAll("[^aeiouAEIOU]","");

       }

    public static void main(String[] args) {
        System.out.println(onlyVowels("Emili"));
    }
}
