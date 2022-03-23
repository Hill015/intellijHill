package com.Syntax.Class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("GANA");
        countries.add("Eritea");
        System.out.println(countries.get(3));
        //System.out.println(countries.get(7)); out of bound error no country on index 7
        //System.out.println(countries.get(-1)); out of bond error can not be negative index
        System.out.println(countries);
        countries.add(3,"Pakistan"); //inserts the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Pakistan");
        System.out.println(countries);





    }
}
