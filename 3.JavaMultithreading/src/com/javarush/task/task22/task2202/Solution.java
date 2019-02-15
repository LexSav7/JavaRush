package com.javarush.task.task22.task2202;

import java.util.Collections;
import java.util.StringTokenizer;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) throw new TooShortStringException();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) count++;
        }
        if (count < 4) throw new TooShortStringException();

        String[] parts = string.split("[ ]+");
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            builder.append(parts[i] + " ");
        }

        return builder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
