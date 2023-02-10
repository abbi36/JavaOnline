package com.fundamentals.lessons;

//Exceptions and Exception Handling
public class Lesson18 {
    String myString;
    House myHouse;
    public void exampleException() {
        try {
            System.out.println(myHouse.equals(myString));
            System.out.println("Try Block Ran");
        } catch (NullPointerException e) {
            System.out.println("Null exception thrown" +e.getMessage());
        } finally {
            System.out.println("Finally block called");
        }
    }

    //try with multiple catches and finally
    public void myArrayException() {
        String[] names = {"Dave", "Matt", "jody"};
        String[] values = {"24", "42", "38"};
        int hmm = Integer.MAX_VALUE;
        try {
            byte b = Byte.parseByte(values[1]);
            int total = Math.addExact(b, hmm);
            System.out.println(total);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        } catch(NumberFormatException nf) {
            System.out.println("That is not a number");
        } catch(ArithmeticException ae) {
            System.out.println("You have given me more than I need");
        } catch(Exception e) {
            System.out.println("I dunno what you did" +e.toString());
        } finally  {
            System.out.println("Finally my number didn't work");
        } //end try catch finally
    }// end method my array exception

} //end class
