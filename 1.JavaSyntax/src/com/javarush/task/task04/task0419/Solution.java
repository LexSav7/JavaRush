package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        int n4 = Integer.parseInt(s4);

        if (n1>n2 && n1>n3 && n1>4) System.out.println(n1);
        else if (n2>n1 && n2>n3 && n2>n4) System.out.println(n2);
        else if (n3>n1 && n3>n2 && n3>n4) System.out.println(n3);
        else if (n4>n1 && n4>n2 && n4>n3) System.out.println(n4);
        else System.out.println(n1);
    }
}
