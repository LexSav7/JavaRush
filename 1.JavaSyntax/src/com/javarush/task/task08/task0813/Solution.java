package com.javarush.task.task08.task0813;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        HashSet<String> hashSet = new HashSet<>();

        String text = "Ляля";

        for (int i = 0; i < 20; i++) {
            hashSet.add(text);
            text += text;
        }

        return hashSet;
    }

    public static void main(String[] args) {
        createSet();
    }
}
