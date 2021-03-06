package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fileReader.ready()){
            String data = fileReader.readLine();
            String[] parts = data.split(" ");
            int count = 0;
            for (String x : words) {
                repeat:
                for (String y : parts) if (x.equals(y)) { count++; break repeat; }
            }
            if (count==2) System.out.println(data);
        }
        fileReader.close();
    }
}
