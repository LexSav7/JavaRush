package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sNumber1 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int nNumber2 = Integer.parseInt(sNumber2);

        System.out.println(name + " получает " + sNumber1 + " через " + sNumber2 + " лет.");
    }
}
