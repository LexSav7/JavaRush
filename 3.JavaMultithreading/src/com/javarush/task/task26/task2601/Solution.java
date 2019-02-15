package com.javarush.task.task26.task2601;

import java.util.*;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        sort(new Integer[] {13, 8, 15, 5, 17});
    }

    public static Integer[] sort(Integer[] array) {
        if (array == null) {
            System.out.println("Please input a valid data!");
            return null;
        }

        Arrays.sort(array);
        final int mediana;
        int half = array.length / 2;

        if (array.length % 2 == 1) {
            mediana = array[half];
        } else {
            mediana = (array[half - 1] + array[half]) / 2;
        }

        Arrays.sort(array, Comparator.comparingInt((Integer o) -> Math.abs(mediana - o)));

        for (Integer x : array) {
            System.out.println(x);
        }

        return array;
    }
}
