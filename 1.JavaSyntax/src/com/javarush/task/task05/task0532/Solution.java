package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = 0;
        int[] a = new int[N];

        if (N > 0) {
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(reader.readLine());
            }
        }

        Arrays.sort(a);
        maximum = a[N-1];

        System.out.println(maximum);
    }
}

// if n = 1
//
// if (i == (N-1)) {
//         for (int j = 1; j < N; j++) {
//        if (a[j] > a[j-1]) z = a[j];
//        else if (a[j] < a[j-1]) z = a[j-1];
//        else if
//        }
//        }
