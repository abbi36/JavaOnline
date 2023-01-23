package com.fundamentals.lessons;

//Arrays
public class Lesson9 {
// single dimension array
    public void basicIntArray() {
        int[] intArray = {23,45,12,8,95,103,37};
        for(int i = 0; i< intArray.length; i++) {
            System.out.println(intArray[i]);
        } //end for loop
    } //end array

    //multi-dimensional array 2D
    public void basicTwoDimensionalArray() {
        int[][] myArray = {{23,45},{35,46}};
        for(int i= 0; i< myArray.length; i++) {
            for(int m = 0; m < myArray[i].length; m++) {
                System.out.println(myArray[i][m]);
            } // inner loop
        } // outer for loop
    } //end array

    public void basicThreeDimensionalArray(){
        int[][][] arr = new int[2][2][2];
        arr[0][0][0] = 10;
        arr[0][1][0] = 12;
        arr[0][0][1] = 13;
        arr[0][1][1] = 14;

        arr[1][0][0] = 15;
        arr[1][1][0] = 16;
        arr[1][0][1] = 17;
        arr[1][1][1] = 18;

        for(int i=0; i < arr.length; i++) {
            for(int k=0; k < arr.length; k++) {
                for(int m=0; m < arr.length; m++) {
                    System.out.println(arr[i][k][m]);
                }
            }
        }
    }//end 3 dimensional array

    //jagged array
    public void basicJaggedArray() {
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "June";
        stringArray[0][1] = "July";
        stringArray[0][2] = "August";
        for(int i = 0; i < stringArray.length; i++) {
            for(int k = 0; k <stringArray[i].length; k++) {
                System.out.println(stringArray[i][k]);
            }
        }
    } // end of jagged array
} // end
