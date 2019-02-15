package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/* 
Задача по алгоритмам
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String data = reader.readLine();
            if (data.isEmpty()) break;
            list.add(data);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);
        for (String x : array) System.out.println(x);

    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i!=j) {
                    if (!isNumber(array[i]) && !isNumber(array[j])) {
                        if (isGreaterThan(array[j], array[i])) {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }

                    if (isNumber(array[i]) && isNumber(array[j])) {
                        if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])){
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}