package com.Lesson5;

import com.fundamentals.Condo;
import com.fundamentals.DaysOfTheWeek;
import com.fundamentals.exercises.Lesson14Exercise;
import com.fundamentals.lessons.House;
import com.fundamentals.lessons.*;

public class Main {

    public static int num = 0;

    static {
        System.out.println("Static block 1");
        num = 42;
    }

    static {
        System.out.println("Static block 2");
        num = 52;
    }

    public static void main(String[] args) {
        //System.out.println("Hello World");
        //lesson5Examples();
        //lesson6Examples();
        //lesson7Example();
        //lesson8Examples();
        //lesson9Examples();
        //lesson10Examples();
        //lesson11Examples();
        //lesson13Examples();
        //lesson14Examples();
        //lesson14Exercise();
        //lesson15Examples();
        //waterBirds();
        lesson16Examples();
    } //end main method

    public static void lesson16Examples() {
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnum();
        myLesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors.ROCKY_ROAD);

        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for(DaysOfTheWeek day: d1) {
            System.out.println(day + " at index "+day.ordinal());
        }

        DaysOfTheWeek d3 = DaysOfTheWeek.WED;
        d3.enumMethod();

        Lesson16Lab[] labs = Lesson16Lab.values();
        for(Lesson16Lab lab : labs) {
            System.out.println("Labrador Color: " +lab.name() + " registration code: "+
                    lab.getAction());
        }
    }



    public static void lesson15Examples() {
            int[] myInt = {1,2,3,4};
            Lesson15Base myBase = new Lesson15Sub(10, myInt, "turned off");
            Lesson15Sub mySub = new Lesson15Sub(10, myInt, "turned on");
            mySub.receiveCall();
            mySub.takePicture();
        }


    public static void lesson14Examples() {
        // Can not change value of a final
        //Lesson14.MY_FIRST_FINAL = 10;

        int total =Lesson14.MY_FIRST_FINAL * 35; // 2145*35
        System.out.println(total);

        //Can change the value of a non-final static
        Lesson14.myFirstStatic = 98; //original was 24
        System.out.println(Lesson14.myFirstStatic);

        Lesson14.myFirstStaticMethod(10);
        System.out.println("Block number was " + num);
    }

    public static void lesson13Examples() {
        House myHouse = new House("blue");
        Condo myCondo = new Condo("medium");
        myHouse.doorOpenClose(myHouse.getDoorColor());
        myCondo.doorOpenClose(myCondo.getDoorColor());
        House myNewHouse = new Condo();
        myNewHouse.doorOpenClose();
    }


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