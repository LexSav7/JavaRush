package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        StringBuilder strBld = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) strBld.append((char)inputStream.read());
        inputStream.close();

        String[] numbers = strBld.toString().split(" ");
        for (String x : numbers) list.add((int) Math.round(Double.parseDouble(x)));

        for (Integer x : list) {
            for (int i = 0; i < x.toString().length(); i++) outputStream.write(x.toString().charAt(i));
            outputStream.write(32);
        }
        outputStream.close();
    }
}
