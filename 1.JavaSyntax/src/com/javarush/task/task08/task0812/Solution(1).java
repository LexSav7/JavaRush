package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 0;

        for (int j = 1; j < list.size(); j++) {
            while (list.get(j) == list.get(j - 1)) {
                count++;
                if (j == (list.size() - 1)) {
                    countList.add(count + 1);
                    break;
                }
                j++;
            }
            countList.add(count + 1);
            count = 0;
        }


//        int max = countList.get(0);
//
//        for (int i = 0; i < countList.size(); i++) {
//            if (max < countList.get(i)) max = countList.get(i);
//        }

        System.out.println(Collections.max(countList));
    }
}