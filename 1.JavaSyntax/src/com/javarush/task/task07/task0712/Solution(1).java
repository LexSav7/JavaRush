package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) list.add(reader.readLine());

        String maxString = Collections.max(list, new MyComparator());
        String minString = Collections.min(list, new MyComparator());

        if (list.indexOf(maxString) > list.indexOf(minString)) System.out.println(minString);
        else System.out.println(maxString);
    }

    public static class MyComparator implements Comparator<String> {

        @Override
        public int compare(String a, String b) {
            return a.length() - b.length();
        }
    }
}
