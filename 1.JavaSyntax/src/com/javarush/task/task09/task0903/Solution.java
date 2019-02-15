package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer x : list) {
            System.out.println(x);
        }

        for (StackTraceElement x : elements) {
            System.out.println(x.getMethodName());
        }
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        elements.add(stackTrace[2]);
        return stackTrace[2].getLineNumber();

    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        elements.add(stackTrace[2]);
        return stackTrace[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        elements.add(stackTrace[2]);
        return stackTrace[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        elements.add(stackTrace[2]);
        return stackTrace[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        elements.add(stackTrace[2]);
        return stackTrace[2].getLineNumber();
    }

    public static ArrayList<StackTraceElement> elements = new ArrayList<>();
}
