package com.Syntax.Class20;

public class Task202 {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features
    // and behaviour. Test all 4 classes
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Teyfur";
        mathTeacher.teachCalculus();
        mathTeacher.age=33;


    }
    }
    class TeacherA{
    String name;
    int age;
    double weight;

    void printName(){
        System.out.println(name);
    }

}
   class MathTeacher extends TeacherA{
    boolean canTeachTrigonometry=true;

    void teachCalculus(){
        System.out.println("Calculus");
    }
   }
   class ChemistryTeacher extends TeacherA{
    boolean teachChemical=true;

    void teacherOrganicChemistry(){
        System.out.println("organic");
    }
   }
   class PianoTeacher extends TeacherA{
    boolean TeachPlay=true;


    void teachPiano(){
    System.out.println("piano");
   }
   }