package com.fundamentals.exercises;

public class Lesson14Exercise {

    public static int voltage = 25;
    public static int current = 35;

    public static int resistance = 45;

    public static void ohmStaticMethod(int num) {
        int total = current * resistance;
        System.out.println(total);
    }

    public static void ohmStaticMethodTwo(int num) {
        int total = voltage / resistance;
        System.out.println(total);
    }

    public static void ohmStaticMethodThree(int num) {
        int total = voltage / current;
        System.out.println(total);
    }


    public static int num = 0;
    static {
        System.out.println("Voltage");
        num = 25;
    }
    static{
        System.out.println("Current");
        num = 35;
    }
    static {
        System.out.println("Resistance");
        num = 45;
    }
}
