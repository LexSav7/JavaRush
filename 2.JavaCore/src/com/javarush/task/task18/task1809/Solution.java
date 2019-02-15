package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) list.add(inputStream.read());
        Collections.reverse(list);
        for (Integer x : list) outputStream.write(x);

        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
