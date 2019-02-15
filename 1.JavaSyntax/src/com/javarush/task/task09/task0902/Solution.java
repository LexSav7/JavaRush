package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

//        System.out.println(method1());
//        System.out.println(method2());
//        System.out.println(method3());
//        System.out.println(method4());
//        System.out.println(method5());
    }

    public static void method1() {
        method2();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
    }

    public static void method2() {
        method3();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
    }

    public static void method3() {
        method4();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
    }

    public static void method4() {
        method5();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
    }

    public static void method5() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());

//        for (StackTraceElement element : stackTrace) {
//            System.out.println(element.getMethodName());
//        }

    }
}
