package com.Syntax.Class18;

public class Account {
       private String userName="Teyfur";
       private String password="1235";
       public String accountNumber="678";
       private double balance=1500;

       private void printUserName(){
           System.out.println(userName);
       }
         protected void printPassword(){
           System.out.println(password);

         }
         void printBalance(){
           System.out.println(balance);
         }

    public static void main(String[] args) {
        Account account=new Account();
        account.printUserName();
        account.printPassword();
        account.printBalance();
    }

}
