package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sYear = reader.readLine();
        int nYear = Integer.parseInt(sYear);

        if(!(nYear%100==0) && nYear%4==0) System.out.println("количество дней в году: 366");
        else if (nYear%400==0) System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
    }
}