package com.javarush.task.task26.task2603;

import java.util.Comparator;

/*
Убежденному убеждать других не трудно
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static class CustomizedComparator<T> implements Comparator<T> {

        public CustomizedComparator(Comparator... comparators) {
            this.comparators = comparators;
        }

        private Comparator<T>[] comparators;

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
