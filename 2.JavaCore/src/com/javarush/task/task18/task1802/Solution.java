package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInput = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        while (fileInput.available() > 0) {
            list.add(fileInput.read());
        }
        fileInput.close();
        reader.close();

        System.out.println(Collections.min(list));
    }
}
