package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();

        StringBuilder strBld = new StringBuilder();
        while (fileReader.ready()) strBld.append((char)fileReader.read());
        fileReader.close();

        String[] parts = strBld.toString().split("\\W");
        int count = 0;
        for (String x : parts) if (x.equals("world")) count++;
        System.out.println(count);

    }
}
