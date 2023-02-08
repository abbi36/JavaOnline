package com.fundamentals.exercises;

public class WaterBirdsSub extends WaterBirds {

    public WaterBirdsSub(String webbedFeet, String dryFeathers, String flatBill) {
        super(webbedFeet, dryFeathers, flatBill);
    }
    @Override
    public void canSwim() {
        System.out.println("The bird can swim");
    }

    @Override
    public void canFly() {
        System.out.println("Some of these birds can fly");
    }

    @Override
    public void eatFish() {
        System.out.println("These birds eat fish");
    }
    @Override
    public void willDive() {
        System.out.println("The bird has dived");
    }
}
