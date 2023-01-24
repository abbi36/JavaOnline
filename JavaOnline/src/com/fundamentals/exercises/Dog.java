package com.fundamentals.exercises;

public class Dog {

    private String dogColor;
    private String dogType;
    private String eyeColor;

    public Dog() {
        this("White", "St.bernard", "Brown");
    }

    public Dog(String dogColor, String dogType, String eyeColor) {
        this.dogColor = dogColor;
        this.dogType = dogType;
        this.eyeColor = eyeColor;
    }

    public Dog(String dogColor) {
        System.out.println("The dog's color is " + dogColor);
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public String getDogColor() {
        return dogColor;
    }
}
