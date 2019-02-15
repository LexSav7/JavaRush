package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double count = 0.0;
        int sum = 0;

        while (true) {
            String s = reader.readLine();
            int n = Integer.parseInt(s);

            if (Integer.parseInt(s) == (-1)) {
                System.out.println(sum/count);
                break;
            }
                sum += n;
                count += 1.0;

        }
    }
}

