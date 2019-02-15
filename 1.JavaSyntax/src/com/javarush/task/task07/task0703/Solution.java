package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] sArray = new String[10];
        int [] nArray = new int[10];

        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = reader.readLine();
        }

        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = sArray[i].length();
            System.out.println(nArray[i]);
        }

    }
}
