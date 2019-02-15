package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        Set<String> set = new TreeSet<>();

        while (fileReader.ready()) {
            String[] parts = fileReader.readLine().split(" ");
            if (map.containsKey(parts[0])) {
                Double value = map.get(parts[0]) + Double.parseDouble(parts[1]);
                map.put(parts[0], value);
            }
            else map.put(parts[0], Double.parseDouble(parts[1]));
        }
        fileReader.close();

        double amount = Collections.max(map.values());
        for (Map.Entry<String, Double> pair : map.entrySet())
            if (pair.getValue() >= amount) set.add(pair.getKey());
        for (String x : set) System.out.println(x);
    }
}
