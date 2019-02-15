package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer token = new StringTokenizer(query, delimiter);
        List<String> tokens = new ArrayList<>();
        while (token.hasMoreTokens()) tokens.add(token.nextToken());
        return tokens.toArray(new String[tokens.size()]);
    }
}
