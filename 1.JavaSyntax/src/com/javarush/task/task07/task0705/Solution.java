package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] allNumbers = new int[20];
        int[] firstNumbers = new int[10];
        int[] secondNumbers = new int[10];

        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < (allNumbers.length/2); i++) {
            firstNumbers[i] = allNumbers[i];
        }

        for (int i = 10; i < allNumbers.length; i++) {
            secondNumbers[i - 10] = allNumbers[i];
            System.out.println(secondNumbers[i - 10]);
        }

    }
}
