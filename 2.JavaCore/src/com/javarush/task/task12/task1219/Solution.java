package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        void fly();
    }

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }


    public class Human implements Run, Swim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements Fly, Run, Swim{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements Run, Swim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements Fly, Run{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
