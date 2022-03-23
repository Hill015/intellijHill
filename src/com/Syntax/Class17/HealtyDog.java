package com.Syntax.Class17;

public class HealtyDog {
    String name; //instance
    String color; //instance
    static int numberOfLegs; //static

    void eat(){
        int noOfTimes=3; // local
        System.out.println(name+" eats "+noOfTimes);
    }

    public static void main(String[] args) {
        HealtyDog dog=new HealtyDog(); // local

        dog.name="scooby";
        dog.color="Pink";

    }

}
