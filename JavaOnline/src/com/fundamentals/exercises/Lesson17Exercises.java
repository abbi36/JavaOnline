package com.fundamentals.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson17Exercises {

    public void televisionCollection() {
        List<String> list = new ArrayList<>();
        list.add("Sony");
        list.add("Samsung");
        list.add("LG");
        list.add("Vizio");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void houseCollections() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(4, "Doors");
        myMap.put(10, "Windows");
        myMap.put(2, "Roofs");
        myMap.put(65, "Shingles");

        for(Map.Entry<Integer, String> map : myMap.entrySet()) {
            System.out.println(map.getKey() + " = " +map.getValue());
        }
    }
}
