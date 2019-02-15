package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        String lastName = "Savenko";

        for (int i = 0; i < 10; i++) {
            map.put(lastName+i, i*100);
        }

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
//        ArrayList<Integer> arrayList = new ArrayList<>(map.values());
//
//        for (Map.Entry<String,Integer> pair : copy.entrySet()) {
//
//        }

        for (Map.Entry<String,Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());

        for (String key : createMap().keySet()) {
            System.out.println(createMap().get(key));
        }
    }
}