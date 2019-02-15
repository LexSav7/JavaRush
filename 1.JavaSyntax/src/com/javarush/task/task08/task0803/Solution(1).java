package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {

        HashMap<String, Cat> map = new HashMap<>();

        Cat cat1 = new Cat(cats[0]);
        Cat cat2 = new Cat(cats[1]);
        Cat cat3 = new Cat(cats[2]);
        Cat cat4 = new Cat(cats[3]);
        Cat cat5 = new Cat(cats[4]);
        Cat cat6 = new Cat(cats[5]);
        Cat cat7 = new Cat(cats[6]);
        Cat cat8 = new Cat(cats[7]);
        Cat cat9 = new Cat(cats[8]);
        Cat cat10 = new Cat(cats[9]);

        map.put(cats[0], cat1);
        map.put(cats[1], cat2);
        map.put(cats[2], cat3);
        map.put(cats[3], cat4);
        map.put(cats[4], cat5);
        map.put(cats[5], cat6);
        map.put(cats[6], cat7);
        map.put(cats[7], cat8);
        map.put(cats[8], cat9);
        map.put(cats[9], cat10);

        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
