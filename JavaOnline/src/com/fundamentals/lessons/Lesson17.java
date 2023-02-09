package com.fundamentals.lessons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Lesson17 {

    // This method will show an Array list of String
    public void exampleArrayList1() {
        List<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("Tuesday");
        list.add("Not Monday");
        list.add("Where\'s Friday");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void exampleArrayList2() {
        ArrayList<House> myHouses = new ArrayList<House>();
        myHouses.add(new House("Red"));
        myHouses.add(new House("Green"));
        myHouses.add(new House("Blue"));
        myHouses.add(new House("White"));

        for(int i = 0; i < myHouses.size(); i++) {
            System.out.println(myHouses.get(i).getDoorColor());
        }
    }

    public void exampleHashset() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");

        Iterator<String> iterate = myHash.iterator();
        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }

    public void exampleHashMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(20, "Days");
        myMap.put(30, "Are Here");
        myMap.put(40, "Happy");

        for(Map.Entry<Integer, String> map : myMap.entrySet()) {
            System.out.println(map.getKey() + " = " +map.getValue());
        }
    }
}
