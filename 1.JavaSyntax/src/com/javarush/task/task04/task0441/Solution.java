package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if (a==b && b==c) System.out.println(a);
        else if (a==b || a==c) System.out.println(a);
        else if (b==a || b==c) System.out.println(b);
        else if (c==a || c==b) System.out.println(c);

        if (a<b && a>c) System.out.println(a);
        else if (a<c && a>b) System.out.println(a);

        if (b<a && b>c) System.out.println(b);
        else if (b<c && b>a) System.out.println(b);

        if (c<a && c>b) System.out.println(c);
        else if (c<b && c>a) System.out.println(c);

    }
}
