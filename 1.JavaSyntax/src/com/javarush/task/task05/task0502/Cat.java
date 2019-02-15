package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public int ourCatScore = 0;
    public int anotherCatScore = 0;

    public boolean fight(Cat anotherCat) {

        if (this.strength > anotherCat.strength) ourCatScore++;
        else anotherCatScore++;


        if (this.weight > 6 || this.weight < 3) ourCatScore--;
        else ourCatScore++;

        if (anotherCat.weight > 6 || anotherCat.weight < 3) anotherCatScore--;
        else anotherCatScore++;


        if (this.age > 5 || this.age < 3) ourCatScore--;
        else ourCatScore++;

        if (anotherCat.age > 5 || anotherCat.age < 3) anotherCatScore--;
        else anotherCatScore++;

        if (ourCatScore > anotherCatScore) return true;
        else return false;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 5;
        cat1.strength = 5;

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 4;
        cat2.strength = 6;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
