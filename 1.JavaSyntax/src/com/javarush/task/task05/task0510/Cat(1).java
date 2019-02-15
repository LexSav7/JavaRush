package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        age = 5;
        weight = 5;
        color = "White";
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "White";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 5;
        color = "White";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 5;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;
    }

    public static void main(String[] args) {

    }
}
