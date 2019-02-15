package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws Exception{

        Date date = new Date();
        SimpleDateFormat currentDate = new SimpleDateFormat("dd MM yyyy");
        System.out.println(currentDate.format(date));

    }
}
