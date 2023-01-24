package com.fundamentals.exercises;

public class Lesson9Exercise {

    public void iceCreamFlavors() {
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "Chocolate";
        stringArray[0][1] = "Vanilla";
        stringArray[0][2] = "Strawberry";
        stringArray[0][3] = "Mint";
        for(int i = 0; i < stringArray.length; i++) {
            for(int k = 0; k <stringArray[i].length; k++) {
                System.out.println(stringArray[i][k]);
            }
        }
    }

    public void chiefsScore() {
        int[][] myArray = {{12, 4},{5,3},{7,1},{15,1}};
        for(int i= 0; i< myArray.length; i++) {
            for(int m = 0; m < myArray[i].length; m++) {
                System.out.println(myArray[i][m]);
            }
        }
    }
}
