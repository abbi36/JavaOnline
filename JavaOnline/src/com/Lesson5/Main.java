package com.Lesson5;

import com.fundamentals.lessons.Lesson5;
import com.fundamentals.lessons.Lesson6;

public class Main {

    public static void main(String[] args) {
       /*
         System.out.println("Hello World");
         lesson5Examples();
        */
        lesson6Examples();
    } //end main method

    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleEquals("Happy");
        String myStr1 = myLesson6.exampleLowercase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUppercase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("pizza", 3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    } //end

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter( 10,15);
        int value = myLesson5.showLocalWithReturn(25,19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5,8));
        myLesson5.showInstanceVariable();
        myLesson5.showCoversions();
    } // end of lesson5Example method

} //end class