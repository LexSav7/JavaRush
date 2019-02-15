package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int n1 = s1.length();
        int n2 = s2.length();

        if (s1.equals(s2)) System.out.println("Имена идентичны");
        else if (!(s1.equals(s2)) && n1==n2) System.out.println("Длины имен равны");
    }
}
