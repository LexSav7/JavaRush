package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        String word = "";
        String sNumber = "";
        int number = 0;

        while (true) {
            sNumber = reader.readLine();
            if (sNumber.isEmpty()) break;
            number = Integer.parseInt(sNumber);

            word = reader.readLine();
            if (word.isEmpty()) break;
            map.put(word, number);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}

    /*Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
    Пустая строка - конец ввода данных.
    Числа могу повторяться.
    Строки всегда уникальны.
    Введенные данные не должны потеряться!
    Затем программа выводит содержание HashMap на экран.
    Каждую пару с новой строки.*/
