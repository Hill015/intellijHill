package com.Syntax.Class24;

public abstract class Phone {         //******ABSTRACTION******
    void makePhoneCall(){
        System.out.println("making a phone call");

    }
    void sendText(){
        System.out.println("Sending a text");

    }
    abstract void displayPicture();



}
class Iphone extends Phone {

    @Override
    void displayPicture(){
        System.out.println("Use photo app to display the pics");

    }

}
class Samsung extends Phone{
    @Override
    void displayPicture(){
        System.out.println("Use gallery to display the pics");
    }
}
