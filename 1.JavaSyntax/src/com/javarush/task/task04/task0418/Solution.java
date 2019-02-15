package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sN1 = reader.readLine();
        String sN2 = reader.readLine();

        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);

        if (n1 < n2) System.out.println(n1);
        else if (n1 > n2) System.out.println(n2);
        else System.out.println(n1);
    }
}