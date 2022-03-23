package com.Syntax.Class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zuhoor";
        System.out.println(student.name);
        student.printName();
        Principle principle=new Principle();
        principle.name="Gulden";
        principle.printName();
        principle.specialParkingSlot=false;

    }
}
