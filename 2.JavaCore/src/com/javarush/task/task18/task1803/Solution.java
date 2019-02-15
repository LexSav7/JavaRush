package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> elements = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        bufferedReader.close();
        fileInputStream.close();

        int element = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) > Collections.frequency(list, element)) element = list.get(i);
        }

        elements.add(element);
        for (Integer x : list) {
            if ((Collections.frequency(list, x) >= Collections.frequency(list, element)) && (!elements.contains(x))) elements.add(x);
        }

        for (Integer x : elements) {
            System.out.print(x + " ");
        }
    }
}
