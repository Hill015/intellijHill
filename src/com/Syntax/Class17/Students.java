package com.Syntax.Class17;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    int sid;
    String sname;
    static int numberOfStudents=21;

    public static void main(String[] args) {
        Students hilmi=new Students();
        hilmi.sid=2656;
        hilmi.sname="Hilmi";
        System.out.println(hilmi.sid);
        System.out.println(hilmi.sid);

        Students s2=new Students();
        s2.sid=2344;
        s2.sname="Asghar";
        System.out.println(s2.sname);
        System.out.println(s2.sid);
        System.out.println(numberOfStudents);

        Students s3=new Students();
        s3.sid=2322;
        s3.sname="john";
        System.out.println(s3.sid);
        System.out.println(s3.sname);
    }

}

