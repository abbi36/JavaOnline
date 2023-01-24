package com.fundamentals.lessons;

// Access Modifiers Extended
public class Lesson10Extended {

    // How to call default method from another class
    public void methodFromOtherClass() {
        System.out.println("This method is public and from the Lesson10Extended");
        Lesson10 lesson10 = new Lesson10();
        lesson10.myDefaultMethod();
        lesson10.myProtectedMethod();
    }
}
