package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        String firstName = "Alex";
        String lastName = "Savenko";

        for (int i = 0; i < 9; i++) {
            map.put(lastName+i, firstName+i);
        }
        map.put("Bully", "Alex0");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        ArrayList<String> arrayList = new ArrayList<>(map.values());

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (Collections.frequency(arrayList, pair.getValue()) > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       removeTheFirstNameDuplicates(createMap());

//        for (Map.Entry<String, String> pair : createMap().entrySet()) {
//            System.out.println(pair);
//        }
    }
}
