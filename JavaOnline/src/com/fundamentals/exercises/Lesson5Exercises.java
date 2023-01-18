package com.fundamentals.exercises;
import com.fundamentals.exercises.*;
import com.fundamentals.lessons.Lesson5;

public class Lesson5Exercises {
    public static void main(String[] args) {
        lesson5Exercise();
    }

    public static void lesson5Exercise() {
        Lesson5 exLesson5 = new Lesson5();
        exLesson5.showLocalExample();
        exLesson5.showLocalWithParameter(1, 29);
        int value = exLesson5.showLocalWithReturn(29, 35);
        System.out.println(value);
        System.out.println(exLesson5.showLocalWithReturn(29, 11101));
        exLesson5.showInstanceVariable();
        exLesson5.showCoversions();
    } // end of lesson5Exercise method
}

