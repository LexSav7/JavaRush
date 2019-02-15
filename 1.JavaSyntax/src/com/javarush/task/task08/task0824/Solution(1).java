package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {

        Human firstChild = new Human("John", true, 20);
        Human secondChild= new Human("Adele", false, 17);
        Human thirdChild = new Human("Will", true, 14);

        ArrayList<Human> children = new ArrayList<>();
        children.add(firstChild);
        children.add(secondChild);
        children.add(thirdChild);

        Human father = new Human("Alex", true, 40, children);
        ArrayList<Human> firstGrand = new ArrayList<>();
        firstGrand.add(father);

        Human mother = new Human("Valerie", false, 38, children);
        ArrayList<Human> secondGrand = new ArrayList<>();
        secondGrand.add(mother);

        Human firstGrandFather = new Human("Fred", true, 67, firstGrand);
        Human firstGrandMother = new Human("Emily", false, 65, firstGrand);
        Human secondGrandFather = new Human("George", true, 65, secondGrand);
        Human secondGrandMother = new Human("Molly", false, 62, secondGrand);

        System.out.println(firstGrandFather);
        System.out.println(secondGrandFather);
        System.out.println(firstGrandMother);
        System.out.println(secondGrandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

