package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sSalary = reader.readLine();
        int nSalary = Integer.parseInt(sSalary);

        System.out.println("Я буду зарабатывать $" + nSalary + " в час");
    }
}
