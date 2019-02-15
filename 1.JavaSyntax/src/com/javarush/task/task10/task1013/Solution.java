package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private Human child;
        private Human mother;
        private Human father;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, Human child) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.child = child;
        }

        public Human(String name, int age, boolean sex, Human child, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.child = child;
            this.mother = mother;
        }

        public Human(String name, int age, boolean sex, Human child, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.child = child;
            this.mother = mother;
            this.father = father;
        }

        public Human(int age, boolean sex, Human child, Human mother, Human father) {
            this.age = age;
            this.sex = sex;
            this.child = child;
            this.mother = mother;
            this.father = father;
        }

        public Human(boolean sex, Human child, Human mother, Human father) {
            this.sex = sex;
            this.child = child;
            this.mother = mother;
            this.father = father;
        }

        public Human(String  name, Human child, Human mother, Human father) {
            this.name = name;
            this.child = child;
            this.mother = mother;
            this.father = father;
        }

        public Human(Human child, Human mother, Human father) {
            this.child = child;
            this.mother = mother;
            this.father = father;
        }


    }
}
