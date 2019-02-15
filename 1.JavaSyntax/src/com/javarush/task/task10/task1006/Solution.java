package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        short b = (short) 45;
        char c = (short) 'c'; //99
        short s = (short) 1005.22;
        int i = 150000;
        float f = 4.10f;
        double d = 1.256d;
        double result = (f * b) // 184.5
                        + (i / c) // 1515
                        - (d * s) // 1262.28
                        + 562.78d;

//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(f);
//        System.out.println(d);
        System.out.println(f*b);
        System.out.println(i/c);
        System.out.println(d*s);
        System.out.println("result: " + result);
    }
}