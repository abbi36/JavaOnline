package com.fundamentals.lessons;

// Lesson 14 Static
public class Lesson14 {

    public static final int MY_FIRST_FINAL = 2145;
    public static int myFirstStatic = 25;

    public static void myFirstStaticMethod(int num) {
        int total = MY_FIRST_FINAL * num;
        System.out.println(total);
    }
}
