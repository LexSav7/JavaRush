package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int e = min(a, b);

        if (e < c && e < d) return e;
        else if (c < e && c < d) return c;
        else return d;
    }

    public static int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}