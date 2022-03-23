package com.Syntax.Class18;

public class FacebookTester {
    public static void main(String[] args) {
        Facebook facebook=new Facebook();
        //facebook.age=15; not work here private access
        facebook.setAge(11);
    }
}
