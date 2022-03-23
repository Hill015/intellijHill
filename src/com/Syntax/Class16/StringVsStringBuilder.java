package com.Syntax.Class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s="Asghar Is Great";
        System.out.println(s.replace(" ","")); //orijinal string i değiştirmedi
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great"); //string builder changes new original string
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder); //  orijinal string i değiştidi

    }
}
