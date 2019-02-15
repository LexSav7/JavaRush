package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Galkin", new Date("JANUARY 2 1997"));
        map.put("Kirkorov", new Date("JANUARY 3 1997"));
        map.put("Luk", new Date("AUGUST 4 1997"));
        map.put("German", new Date("JANUARY 5 1997"));
        map.put("Cache", new Date("JANUARY 6 1997"));
        map.put("Cookie", new Date("JANUARY 7 1997"));
        map.put("Notebook", new Date("JANUARY 8 1997"));
        map.put("Zinaida", new Date("JANUARY 9 1997"));
        map.put("Cat", new Date("JANUARY 10 1997"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth();

            if (month >= 5 && month <= 7) iterator.remove();
//            else System.out.println(iterator.next());

        }

//        for (Map.Entry<String, Date> pair : map.entrySet()) {
//            int month = pair.getValue().getMonth();
//            if (month >= 6 && month <= 8) map.remove(pair.getKey(), pair.getValue());
//            else System.out.println(pair.getKey() + " - " + pair.getValue());
//        }

    }

    public static void main(String[] args) {
//        removeAllSummerPeople(createMap());
    }
}
