package com.fundamentals.exercises;

public abstract class WaterBirds implements MovementInterface {

    private String webbedFeet;
    private String dryFeathers;
    private String flatBill;

    public WaterBirds(String feet, String feather, String flatBill) {
        this.webbedFeet = feet;
        this.dryFeathers = feather;
        this.flatBill = flatBill;
    }

    public String getwebbedFeet() {
        return webbedFeet;
    }

    public String getdryFeathers() {
        return dryFeathers;
    }

    public String getflatBill() {
        return flatBill;
    }

    public abstract void canSwim();
    public abstract void canFly();
    public abstract void eatFish();

    public void willDive() {
        System.out.println("Will dive for food");

    }
}
