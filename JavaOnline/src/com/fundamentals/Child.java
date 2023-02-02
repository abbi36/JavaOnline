package com.fundamentals;


import com.fundamentals.exercises.Dog;

//subclass of Child lesson 12 & lesson 13
public class Child extends Dog{
    private String tail;

    public Child() {
        System.out.println("Default Child constructor");
    }
    public Child(String tail) {
        this(tail, "white","poodle", "shingles");
        //this.tail = tail;
    }

    public Child(String tail, String dogColor, String dogType, String eyeColor) {
        super(dogType,eyeColor,dogColor);
        this.tail = tail;
    }

    public String gettail() {
        return tail;
    }

    public void settail(String tail) {
        this.tail = tail;
    }

    public void maintenance() {
        System.out.println("Will grab it's tail");
    }

    //@Override
    public void tailWags() {
        super.getDogColor();
        System.out.println("The puppy's tail is");
    }

    //@Override
    public void tailWags(String dogColor) {
        System.out.println("The puppy's tail wags");
    }
}
