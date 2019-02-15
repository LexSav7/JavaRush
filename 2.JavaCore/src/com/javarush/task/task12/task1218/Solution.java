package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        void fly();
    }

    public interface Move {
        void move();
    }

    public interface Eat {
        void eat();
    }

    public class Dog implements Move, Eat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements Move, Eat, Fly{
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements Move{
        @Override
        public void move() {

        }
    }

    public class Airplane implements Move, Fly{

        @Override
        public void move() {

        }

        @Override
        public void fly() {

        }
    }
}
