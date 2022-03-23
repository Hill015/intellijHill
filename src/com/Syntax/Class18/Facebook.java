package com.Syntax.Class18;

public class Facebook {
    private String username;
    private String password;
    private int age;
      void setAge(int personAge){

          if(personAge>13&& personAge<120){
              age=personAge;

          }else{
              System.out.println("not "+" allowed its not a Horse");
          }
      }
}
