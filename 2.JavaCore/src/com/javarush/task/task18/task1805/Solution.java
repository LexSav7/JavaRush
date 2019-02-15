package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        Set<Integer> set = new TreeSet<>();

        while (fileInputStream.available() > 0) set.add(fileInputStream.read());

        bufferedReader.close();
        fileInputStream.close();

        for (Integer x : set) System.out.print(x + " ");

    }
}
