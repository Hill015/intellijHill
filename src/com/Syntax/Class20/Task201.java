package com.Syntax.Class20;

public class Task201 {
    // Write program to inherit class A that has method printF which is static and call or reuse
    // that method into class B
    public static void main(String[] args) {
        AA.printF();
    }
}
    class AA {

    static void printF() {
        System.out.println("batch 12");

    }
    }
    class BB extends AA{

        }



