package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/
public class Solution extends Thread {

    UncaughtExceptionHandler handler;

    public Solution() {
        handler = (t, e) -> {
            if (e instanceof Error) System.out.println("Нельзя дальше работать");
            else if (e instanceof Exception) System.out.println("Надо обработать");
            else if (e != null) System.out.println("Поживем - увидим");
        };
        setUncaughtExceptionHandler(handler);
    }

    @Override
    public void run() {
        throw new AssertionError();
    }

    public static void main(String[] args) {
        new Solution().start();
    }
}
