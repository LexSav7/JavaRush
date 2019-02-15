package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if(!t.isInterrupted()) t.interrupt();

        List<Throwable> list = new ArrayList<>();
        while (e != null) {
            list.add(e);
            e = e.getCause();
        }

        Collections.reverse(list);
        for (Throwable x : list) System.out.println(x);

    }

    public static void main(String[] args) {
//        new Thread(() -> {
//            Thread.currentThread().setUncaughtExceptionHandler(new Solution());
//            throw new RuntimeException("ABC", new Exception("DEF", new IllegalAccessException("GHI")));
//        }).start();

        new Solution().uncaughtException(Thread.currentThread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
