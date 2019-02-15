package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL(reader.readLine());
        String[] params = url.getQuery().split("&");

        for (String x : params) {
            if (x.contains("=")) System.out.print(x.substring(0, x.indexOf("=")) + " ");
            else System.out.print(x + " ");
        }

        System.out.println();

        for (String x : params) {
            String sub = null;
            if (x.contains("obj")) {
                sub = x.substring(x.indexOf("=") + 1);

                if (sub.matches("\\d+.\\d+")) {
                    try {
                        alert(Double.valueOf(sub));
                    } catch (NumberFormatException e) {
                        alert(sub);
                    }
                } else alert(sub);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
