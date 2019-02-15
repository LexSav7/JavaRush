package com.javarush.task.task20.task2010;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;

/*
Как сериализовать что-то свое?
*/
public class Solution {
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int countStrings;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++countStrings;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    class Cat implements Serializable
    {
        public String name;
        public int age;
        public int weight;

        public InputStream in = System.in;
    }

    public static void main(String[] args) {


    }
}
