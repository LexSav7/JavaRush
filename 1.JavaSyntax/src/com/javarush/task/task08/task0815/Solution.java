package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Savenko", "Alex");
        map.put("Borov", "Victor");
        map.put("Romanina", "Anna");
        map.put("Bobrov", "Mihail");
        map.put("Vosnetsov", "Anatoliy");
        map.put("Lugovskaya", "Ekaterina");
        map.put("Makarov", "Vitaliy");
        map.put("Gagarin", "Larisa");
        map.put("Shibalov", "Anna");
        map.put("Watson", "Anna");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;

//        if (map.containsValue(name)) {
//            for (Map.Entry<String, String> pair : map.entrySet()) {
//                String findName = pair.getValue();
//                if (findName.equals(name)) {
//                    count++;
//                }
//            }
//        } else return 0;

        for (String value : map.values()) {
            if (value.equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

//        if (map.containsKey(lastName)) {
//            for (Map.Entry<String, String> pair : map.entrySet()) {
//                String findLastName = pair.getKey();
//                if (findLastName.equals(lastName)) {
//                    count++;
//                }
//            }
//        } else return 0;

        return map.containsKey(lastName) ? 1 : 0;

    }

    public static void main(String[] args) {

    }
}
