package com.Syntax.Class18;

import com.Syntax.Class17.Students;

public class Task1 {
    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     *
     */
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task1 student1=new Task1();
        student1.name="Hilmi";
        student1.id="123";
        Task1.numberOfStudents++;

        Task1 student2=new Task1();
        student2.name="Asghar";
        student2.id="345";
        Task1.numberOfStudents++;

        Task1 student3=new Task1();
        student3.name="Sayed";
        student3.id="789";
        Task1.numberOfStudents++;
        System.out.println(Task1.numberOfStudents);

    }

}

