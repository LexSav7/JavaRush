package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) {
            String sData = "";
            while (true) {
                char cData = (char) inputStream.read();
                if (Character.isDigit(cData) || cData=='-') sData += cData;
                else break;
            }
            int nData = 0;
            if (!sData.isEmpty()) {
                nData = Integer.parseInt(sData);
                if (nData%2==0) list.add(nData);
            }
        }

        inputStream.close();
        Collections.sort(list);

        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
