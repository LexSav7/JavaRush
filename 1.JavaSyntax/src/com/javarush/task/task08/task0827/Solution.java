package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date currentDate = new Date(date);
        Date startDate = new Date();

        startDate.setDate(1);      // первое число
        startDate.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        startDate.setYear(currentDate.getYear());

        long msDifference = currentDate.getTime() - startDate.getTime();
        int oneDay = 1000 * 60 *60 * 24;
        int days = (int) (msDifference/oneDay);

        System.out.println(days);

        if (days%2==0) return false;
        else return true;
    }
}
