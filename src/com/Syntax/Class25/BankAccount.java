package com.Syntax.Class25;

public class BankAccount {
    private double balance=12345;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName="Hilmi";
    private String password="Hilmi123";

    void printBalance(String userName,String password){
        if(userName.equals("Hilmi")&&password.equals("Hilmi123")){
            System.out.println(balance);
        }else{
            System.out.println("not authorized");
        }


    }


    public void printBalance() {
    }
}
