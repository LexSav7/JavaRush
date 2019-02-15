package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        int count = 0;
        map.put(count, "ноль");
        map.put(++count, "один");
        map.put(++count, "два");
        map.put(++count, "три");
        map.put(++count, "четыре");
        map.put(++count, "пять");
        map.put(++count, "шесть");
        map.put(++count, "семь");
        map.put(++count, "восемь");
        map.put(++count, "девять");
        map.put(++count, "десять");
        map.put(++count, "одиннадцать");
        map.put(++count, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fileReader.ready()) {
            String data = fileReader.readLine();
            String[] parts = data.split(" ");
            for (Integer x : map.keySet())
                for (int i = 0; i < parts.length; i++)
                    if (x.toString().equals(parts[i])) parts[i] = map.get(x);

            for (String x : parts) System.out.print(x + " ");
            System.out.println();
        }

        fileReader.close();
    }
}
