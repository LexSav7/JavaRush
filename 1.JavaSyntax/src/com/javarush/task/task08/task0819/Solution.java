package com.javarush.task.task08.task0819;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        iterator.next();
        iterator.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> catHashSet = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            catHashSet.add(new Cat());
        }

        return catHashSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat x : cats) {
            System.out.println(x);
        }
    }

    public static class Cat {

    }
}
