package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        TreeMap<Character, Integer> map = new TreeMap<>();
        ArrayList<Character> list = new ArrayList<>();

        while (inputStream.available() > 0) list.add((char) inputStream.read());
        inputStream.close();
        for (int i = 0; i < 128; i++) map.put((char) i, Collections.frequency(list, (char) i));
        for (Map.Entry<Character, Integer> pair : map.entrySet())
            if (pair.getValue()>0) System.out.println(pair.getKey() + " " + pair.getValue());
    }
}