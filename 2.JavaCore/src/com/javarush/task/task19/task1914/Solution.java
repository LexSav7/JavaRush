package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testString.printSomething();

        System.setOut(consoleStream);
        String x = outputStream.toString();
        String[] parts = x.split(" ");
        switch (parts[1]) {
            case "+": System.out.print(x + (Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]))); break;
            case "-": System.out.print(x + (Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]))); break;
            case "*": System.out.print(x + (Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]))); break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

