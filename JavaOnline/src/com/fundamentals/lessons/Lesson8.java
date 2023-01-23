package com.fundamentals.lessons;


// Lesson 8 Control Flow
public class Lesson8 {

    //if statement
    public void basicIfExample(int num1, int num2) {
        System.out.println("Before if statement");
        if(num1 == num2) {
            System.out.println("Values are equal");
        } //end if
        System.out.println("After if statement");
    } // end method

    //if else statement
    public void basicIfElseExample(int alpha, int beta){
        System.out.println("Before if statement");
        if(alpha != beta) {
            System.out.println("The values are not equal");
        } else {
            System.out.println("The values are equal");
        } // end if else
        System.out.println("End of if else statement");
    } //end method
    //if else chain
    public void basicIfElseChainExample(int value){
        if (value < 30) {
            System.out.println("The value is less than 30");
        } else if (value<= 40) {
            System.out.println("The value is greater than 30 but less than or equal to 40");
        } else {
            System.out.println("The value is greater than 40");
        }
    } //end if else chain

    // And , Or statement with if
    public void basicIfAndOrExample(int num) {
        if(num > 100 || num < 50) {
            System.out.println("The value is less than 50 or greater than 100");
        } //end if
        if(num % 2 == 0 && num > 30) {
            System.out.println("The value is greater than 30 and an even number");
        }
    }//end and/or method

    //switch statement
    public void basicSwitchExample(int day) {
        switch (day){
            case 1:
                System.out.println("day = 1");
                break;
            case 2:
            case 3:
                System.out.println("day is either 2 or 3");
                break;
            default:
                System.out.println("day is greater than 3");
                break;
        } //end switch
    }

    //while loop
    public void basicWhileExample() {
        int val = 0;
        while (val < 10) {
            System.out.println(val);
            val++; //increment
        }
    } //end while example

    public void basicDoWhileExample() {
        int num = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num ++;
        } while(num < 24);
    }

    //for loop
    public void basicForLoopExample() {
        for(int i =0; i < 10; i++) {
            System.out.println(i);
        } // end method
    } // end loop

    //branching statements of continue and break
    public void basicBranchExample() {
        for(int i = 0; i <10; i++) {
            if(i == 2) {
                continue;
            }
            if (i==4) {
                System.out.println("loop breaks");
                break;
            }
            System.out.println(i);
        }
        System.out.println("End of loop");
    }
} //end
