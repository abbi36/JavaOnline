package com.fundamentals.exercises;

public class Lesson11Exercise {

    private int screenSize;
    private int price;
    private int ports;
    private String isMountable;

    public Lesson11Exercise() {
        this(75, 350, 4, "Yes");
        System.out.println("The Tv is turned on ");
    }


    public Lesson11Exercise(int screenSize, int price, int ports, String isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.ports = ports;
        this.isMountable = isMountable;
    }
    public void setscreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getscreenSize() {
        return screenSize;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public int getprice() {
        return price;
    }

    public int getports() {
        return ports;
    }

    public void setports(int ports) {
        this.ports = ports;
    }


}
