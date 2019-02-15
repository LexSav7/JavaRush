package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            if (n==(-1)) {
                sum -= 1;
                break;
            }
            sum += n;
        }

        System.out.println(sum);
    }
}
