package com.fundamentals;


import com.fundamentals.lessons.House;

//subclass of House lesson 12
public class Condo extends House{
    private String balcony;

    public Condo() {
        System.out.println("Default condo constructor");
    }
    public Condo(String balcony) {
        this.balcony = balcony;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public void maintenance() {
        System.out.println("Will fix condo issues");
    }
}
