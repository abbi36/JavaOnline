package com.fundamentals.lessons;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
/*
* Lesson 7
* Java Operators
* */
public class Lesson7 {

    int value1 = 23, value2 = 45;
    public void basicMath() {
        System.out.println(value1 + value2);
        System.out.println(value1 - value2);
        System.out.println(value1 * value2);
        System.out.println(value1 / value2);
    } // end method

    //modulus
    public void exampleModulus() {
        int total = value1 % value2;
        System.out.println(total);
    } //end method

    //Scanner utility
    public void addTwoNumbers() {
        int x,y,z;
        System.out.println("Enter two numbers to calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("The sum of entered values = " + z);
    } // end method

    //assignment operators basic math
    public void exampleAssignment1() {
        value1 += value2;
        System.out.println(value1);
        value2 -= value1;
        System.out.println(value2);

        value1 *= value2;
        System.out.println(value1);
        value1 /= value2;
        System.out.println(value2);
        value1 %= value2;
        System.out.println(value1);
    } //end method

    //assignment operators
    public void exampleAssignment2() {
        int beta = 10, charlie = 5;
        beta <<= charlie;
        System.out.println(beta);
        charlie >>= beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie ^= beta;
        System.out.println(charlie);
    } // end method
} //end
