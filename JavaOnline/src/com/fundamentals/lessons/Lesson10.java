package com.fundamentals.lessons;

//Access Modifiers
public class Lesson10 {

    //private access modifier
    private void myMethod() {
        System.out.println("myMethod is a private method");
    } // end method

    // Default access modifier
    void myDefaultMethod() {
        System.out.println("Method from a default access modifier");
        System.out.println("The next statement comes from a private method");
        myMethod();
    }//end method

    //protected access modifier
    protected void myProtectedMethod() {
        System.out.println("myProtected method is using the protected modifier");
    } //end method

} //end
