package com.Lesson5;

import com.fundamentals.lessons.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        //lesson5Examples();
        //lesson6Examples();
        //lesson7Example();
        //lesson8Examples();
        //lesson9Examples();
        //lesson10Examples();
        lesson11Examples();
    } //end main method


    public static void lesson11Examples() {
        House myHouse = new House();
        House myOtherHouse = new House("Red");

    }

    public static void lesson10Examples() {
        Lesson10 myLesson10 = new Lesson10();
        Lesson10Extended myExtended = new Lesson10Extended();
        //myLesson10.myDefaultMethod(); // method is default outside this package
        myExtended.methodFromOtherClass();
       // myLesson10.myProtectedMethod(); // method is protected and is not subclassed outside package
    }

    public static void lesson9Examples() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }

    public static void lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(12,17);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(65);
        myLesson8.basicSwitchExample(2);
        myLesson8.basicWhileExample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchExample();
    }

    public static void lesson7Example() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        //myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    }
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