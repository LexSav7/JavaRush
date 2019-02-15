package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human firstGrandFather = new Human("George", true, 57);
        Human firstGrandMother = new Human("Anna", false, 55);
        Human secondGrandFather = new Human("Fred", true, 60);
        Human secondGrandMother = new Human("Adeline", false, 57);
        Human father = new Human("Alex", true, 34, firstGrandFather, firstGrandMother);
        Human mother = new Human("Emma", false, 31, secondGrandFather, secondGrandMother);
        Human son = new Human("Al", true, 11, father, mother);
        Human secondSon = new Human("John", true, 8, father, mother);
        Human daugther = new Human("Veronika", false, 5, father, mother);

        System.out.println(firstGrandFather);
        System.out.println(firstGrandMother);
        System.out.println(secondGrandFather);
        System.out.println(secondGrandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(secondSon);
        System.out.println(daugther);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















