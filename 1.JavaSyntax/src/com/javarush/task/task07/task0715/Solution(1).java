package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = 0; i < list.size(); i++) {
            if (!(i%2==0)) list.add(i, "именно");
            else if (i==list.size()-1) {
                System.out.println(list.get(i));
                list.add("именно");
                System.out.println(list.get(list.size()-1));
                break;
            }
            System.out.println(list.get(i));
        }

    }
}
