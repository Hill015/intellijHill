package com.Syntax.Class24;

public class Parent {
    final String name="Vladlen";

    final void method(){
        // name="Mr.A" can reassign if a variable is final
        System.out.println("i am parent");

    }

}
class Child extends Parent{

    /*void method (){
    cant override because it is final method
     */

}
