package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int plus = a + b;
        return plus;
    }

    public static int minus(int a, int b) {
        int minus = a - b;
        return minus;
    }

    public static int multiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static double division(int a, int b) {
        double division = (double) a / b;
        return division;
    }

    public static double percent(int a, int b) {
        double percent = (double) ((a * b) / 100);
        return percent;
    }

    public static void main(String[] args) {

    }
}
