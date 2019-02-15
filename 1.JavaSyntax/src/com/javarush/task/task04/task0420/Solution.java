package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        if (n1>=n2 && n1>=n3) System.out.print(n1 + " ");
        else if (n2>=n1 && n2>=n3) System.out.print(n2 + " ");
        else System.out.print(n3 + " ");

        if (n1>=n2 && n1<=n3) System.out.print(n1 + " ");
        else if (n1>=n3 && n1<=n2) System.out.print(n1 + " ");
        else if (n2>=n1 && n2<=n3) System.out.print(n2 + " ");
        else if (n2>=n3 && n2<=n1) System.out.print(n2 + " ");
        else System.out.print(n3 + " ");

        if (n1<=n2 && n1<=n3) System.out.print(n1 + " ");
        else if (n2<=n1 && n2<=n3) System.out.print(n2 + " ");
        else System.out.print(n3 + " ");

    }
}
