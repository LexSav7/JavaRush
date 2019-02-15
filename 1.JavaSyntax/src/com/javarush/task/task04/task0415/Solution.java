package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        int nA = Integer.parseInt(sA);

        String sB = reader.readLine();
        int nB = Integer.parseInt(sB);

        String sC = reader.readLine();
        int nC = Integer.parseInt(sC);

        if ((nA+nB)>nC && (nA+nC)>nB && (nB+nC)>nA) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

        }
    }
