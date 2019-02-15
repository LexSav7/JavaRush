package com.javarush.task.task09.task0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> list = new ArrayList<>();
        int[] arrayLength = new int[]{5, 2, 4, 7, 0};

        for (int i = 0; i < arrayLength.length; i++) {
            list.add(new int[arrayLength[i]]);
            for (int j = 0; j < arrayLength[i]; j++) {
                list.get(i)[j] = new Random().nextInt(100);
            }
        }

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
