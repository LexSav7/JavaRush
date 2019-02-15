package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 27.5));
        System.out.println(convertEurToUsd(548, 13215.0));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur * course;
        return usd;
    }
}
