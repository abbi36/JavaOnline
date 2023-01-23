package com.fundamentals.exercises;
import java.util.Scanner;
public class Lesson7Exercise {
    public void exampleScanner() {
        int x,y,z;
        System.out.println("Enter two numbers to calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("The sum of entered values = " + z);
    }

    public void exampleDoubleData() {
        int value3 = 45, value4 = 62;
        value3 += value4;
        System.out.println(value3);
        value4 ^= value3;
        System.out.println(value4);
        value3 *= value4;
        System.out.println(value4);
        value3 /= value4;
        System.out.println(value4);
        value3 %= value4;
        System.out.println(value3);
    }

    public void exampleMath() {
        int sum1 = 10 + 32 * 12 /3;
        System.out.println(sum1);
        int sum2 = 3 + 12 * 32 /10;
        System.out.println(sum2);

    }
}
