package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();

    if (Character.isLowerCase(s.charAt(0))) System.out.print(Character.toUpperCase(s.charAt(0)));
    else System.out.print(s.charAt(0));

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i-1)==' ' && s.charAt(i)!=' ') System.out.print(Character.toUpperCase(s.charAt(i)));
        else System.out.print(s.charAt(i));
    }

    }
}
