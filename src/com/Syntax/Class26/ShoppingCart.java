package com.Syntax.Class26;

public class ShoppingCart { // we have to make private to protect
   private double originalPrice=100;

    private double discount=.15;

    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;
        }else {
            System.out.println("can't have that much discount");
        }
    }

    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);

    }

}
