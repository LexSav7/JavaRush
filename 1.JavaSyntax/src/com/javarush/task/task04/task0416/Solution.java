package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sT = reader.readLine();
        double t = Double.parseDouble(sT);

        if (t > 0 && t < 60) {
            for (int i = 0; i < 12; i++) {
                int d = 5;

                if (t >= (0 + (i * d)) && t < (3 + (i * d))) {
                    System.out.println("зелёный");
                    break;
                } else if (t >= (3 + (i * d)) && t < (4 + (i * d))) {
                    System.out.println("жёлтый");
                    break;
                } else if (t >= (4 + (i * d)) && t < (5 + (i * d))) {
                    System.out.println("красный");
                    break;
                }
            }
        }
    }
}