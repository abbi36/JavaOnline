package com.fundamentals.lessons;
/*
*   The content of this class is for the lesson 6 slide deck
* Strings & More
* */

import java.util.Locale;

public class Lesson6 {

    String myString = "Hello";

    // String method for charAt
    public void exampleCharAt(){
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    } //method end

    //Comparing two strings to see if they are equal
    public void exampleEquals(String value) {
        boolean myBoolean = myString.equals(value);
        System.out.println(myBoolean);
    } // method end

    // to lower case example
    public String exampleLowercase() {
        return myString.toLowerCase();
    } //method end

    // to upper case method
    public String exampleUppercase() {
        return myString.toUpperCase();
    } //method end

    // .length method
    public void exampleLength() {
        int length = myString.length();
        System.out.println(length);
    } //end method

    // StringBuilder class
    public void exampleBuilder(String food, int value) {
        StringBuilder builder = new StringBuilder();
        builder.append(" My favorite food is ");
        builder.append(food).append(" and I ate ");
        builder.append(value).append(" plates of it.");
        String fav = builder.toString();
        System.out.println(fav);
    } //method end

    //char data type
    public void exampleChar() {
        char c1 = 't'; //\u0074
        char c2 = '\u00A7';
        System.out.println(c2);
    } //end

    // Escape sequences
    public void exampleEscape() {
        System.out.println("That\'s a cool toy. \tCan I\n play with it.");
    } //end

} //end class
