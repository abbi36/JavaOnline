package com.fundamentals.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Lesson18Exercises {

    public void leapYear() {
        String leap = " ";
        int leapParse = 0;
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter a valid year");
            leap = String.valueOf(in.nextInt());
            leapParse = Integer.parseInt("leap");
        } catch(InputMismatchException ime) {
            System.out.println("That is not a number");
        } catch(NumberFormatException nfe) {
            if(leap.length() != 4) {
                System.out.println("That is not a valid year");
            }
            else if (leapParse % 400 == 0 || (leapParse % 100 != 0 && leapParse % 4 == 0)) {
                System.out.println("That is a leap year");
            } else {
                System.out.println("That ia not a leap year");
            }
        }
    }
}
