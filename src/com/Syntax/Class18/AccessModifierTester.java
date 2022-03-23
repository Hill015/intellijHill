package com.Syntax.Class18;

public class AccessModifierTester {
    public static void main(String[] args) {
        //can not as name has private access
        AccessModifiers am=new AccessModifiers();
       // System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);

    }
}


