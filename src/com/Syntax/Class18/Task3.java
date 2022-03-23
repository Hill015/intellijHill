package com.Syntax.Class18;

public class Task3 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String name ="Emili";
        System.out.println(Task3.reverseString(name));
    }

    }

