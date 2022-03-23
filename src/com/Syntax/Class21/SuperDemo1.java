package com.Syntax.Class21;

public class SuperDemo1 {
    class AAA{
        AAA(){

        }

    }
    class BBB extends AAA{
        String name;
        BBB(){

        }
        BBB(String name){
            super();
            //this(); we cant use this() and super() inside the same constructor
            this.name=name;

        }
    }
}
