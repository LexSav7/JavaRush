package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        while (bufferedReader.ready()) bufferedWriter.write(bufferedReader.readLine().replaceAll("\\p{Punct}", ""));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
