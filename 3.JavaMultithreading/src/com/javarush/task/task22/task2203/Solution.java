package com.javarush.task.task22.task2203;

import java.util.ArrayList;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '\u0009') ++count;
            if (count == 2) break;
        }
        if (count < 2) throw new TooShortStringException();

        int first = string.indexOf('\u0009');
        return string.substring(first + 1, string.indexOf('\u0009', first + 1));
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
