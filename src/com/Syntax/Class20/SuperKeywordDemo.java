package com.Syntax.Class20;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }
}
class Parent{
    String color="Black";
}
class Child extends Parent{
    String color="Red";

    void printColor(){
        String color="Green"; // first print local color
        System.out.println(this.color);//with this refers to instance variable
        System.out.println(color);
        System.out.println(super.color); //refers to parent variable
    }
}