package com.company;

import java.util.HashMap;
import java.util.Map;

// Data Structure which helps you store values in the form of (key: value) pair.
// (key, value) --> Any Type --> Generic | Primitive | Collection of Generics.
public class HashMaps {
    public static void main(String[] args) {
        // If I want to implement or use the methods of Maps, then I will implement a Map as a HashMap
        Map<Integer, String> myMap = new HashMap<>();
        // Map<Integer, String> myMap = new HashMap<>(20);

        myMap.put(100, "Hundred");
        myMap.put(200, "Two Hundred");
        myMap.put(300, "Three Hundred");
        myMap.put(400, "Four Hundred");

        System.out.println(myMap.keySet());                                     // [400, 100, 200, 300]

        System.out.println("Key 100 is available in the Map - " + myMap.containsKey(100));
        System.out.println("Key 1000 is available in the Map - " + myMap.containsKey(1000));

        System.out.println("Value available in the Map - " + myMap.containsValue("Hundred"));
        System.out.println("Value available in the Map - " + myMap.containsValue("Thousand"));

        System.out.println("The value for key 100 is - " + myMap.get(100));

        // Iterate over a Map -
        // 1. for Loop
        // SYNTAX -> for(Map.Entry<KeyType, ValueType> iterator : mapObject.entrySet() )
        for(Map.Entry<Integer, String> itr : myMap.entrySet()) {
            System.out.println("Key --> " + itr.getKey() + " : " + " Value --> " + itr.getValue());
        }

        // 2. forEach()
        // SYNTAX -> mapObject.forEach( (key, value) -> {....} )
        myMap.forEach( (k, v) -> System.out.println("Key --> " + k + " : " + "Value --> " + v) );
    }
}
