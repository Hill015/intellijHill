package com.Syntax.Class17;

public class SyntaxEmployee {

        String empId;
        double salary;
        static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselsClassObject=new SyntaxEmployee();
        aselsClassObject.empId="123";
        aselsClassObject.salary=200000;
        System.out.println(aselsClassObject.empId);
        System.out.println(aselsClassObject.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee moazzamObject=new SyntaxEmployee();
        moazzamObject.empId="456";
        moazzamObject.salary=198000;
        System.out.println(moazzamObject.empId);
        System.out.println(moazzamObject.salary);
        System.out.println(CEO);
    }
}
