package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        StringBuilder strBld = new StringBuilder();
        while (fileReader.ready()) strBld.append((char) fileReader.read());
        fileReader.close();

        String[] parts = strBld.toString().split("\\s+");
        for (String x : parts) if (x.matches("\\d+")) fileWriter.write(x + " ");
        fileWriter.close();
    }
}
