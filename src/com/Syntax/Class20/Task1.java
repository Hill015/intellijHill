package com.Syntax.Class20;

import com.Syntax.Class18.Task3;

public class Task1 {


    private Task1() {
        System.out.println("private");

    }

    Task1(double a) {
        System.out.println("Default");
    }

    protected Task1(String a) {
        System.out.println("protected");
    }

    public Task1(boolean a) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task1();
        new Task1("haha");
        new Task1(10.2);
        new Task1(false);



    }
}


