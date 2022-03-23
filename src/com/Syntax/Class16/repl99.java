package com.Syntax.Class16;

import java.util.Scanner;

public class repl99 {




        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            //write your code below
            String reverse="";
            int length = givenString.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + givenString.charAt(i);
            if (givenString.equals(reverse))
                System.out.println(true);
            else
                System.out.println(false);



        }
    }

