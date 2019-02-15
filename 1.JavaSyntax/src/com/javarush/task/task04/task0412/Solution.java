package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sValue = reader.readLine();
        int nValue = Integer.parseInt(sValue);

        if(nValue<0) System.out.println(nValue + 1);
        else if (nValue>0) System.out.println(nValue * 2);
        else System.out.println(nValue);
    }

}