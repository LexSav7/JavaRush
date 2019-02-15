package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();

        while (true) {
            String key = reader.readLine();
            if (key.isEmpty()) {break;}
            String value = reader.readLine();

            map.put(key, value);
        }

        String check = reader.readLine();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (check.equals(pair.getKey())) System.out.println(pair.getValue());
        }
    }
}
