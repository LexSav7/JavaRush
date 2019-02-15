package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder builder = new StringBuilder();

        while (reader.ready()) {
            String[] data = reader.readLine().split(" ");
            for (String x : data) if (x.length() > 6) builder.append(x + ',');
        }
        reader.close();

        builder.deleteCharAt(builder.length()-1);
        writer.write(builder.toString());
        writer.close();
    }
}
