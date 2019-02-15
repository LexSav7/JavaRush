package com.javarush.task.task14.task1404;

/* 
Коты
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data = reader.readLine();
            if (data.isEmpty()) break;
            CatFactory.getCatByKey(data);
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
                System.out.println(cat);
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
                System.out.println(cat);
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
                System.out.println(cat);
            } else {
                cat = new Cat(key);
                System.out.println(cat);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
