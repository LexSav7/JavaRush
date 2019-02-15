package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        if (a>0 && b>0) System.out.println(1);
        else if (a<0 && b>0) System.out.println(2);
        else if (a<0 && b<0) System.out.println(3);
        else System.out.println(4);
    }

//    для первой четверти a>0 и b>0;
//    для второй четверти a<0 и b>0;
//    для третьей четверти a<0 и b<0;
//    для четвертой четверти a>0 и b<0.
}
