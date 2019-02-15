package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Alex", 21, "Ukraine");
        System.out.println(man.name + " " + man.age + " " + man.address);
        Man man2 = new Man("Alex", 21, "Ukraine");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman = new Woman("Someone", 20, "Russia");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        Woman woman2 = new Woman("Someone", 20, "Russia");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
