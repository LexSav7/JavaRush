package com.javarush.task.task27.task2705;

/* 
Второй вариант deadlock
*/
public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            secondMethod();
//            doSomething();
        }
    }

    public void secondMethod() {
        synchronized (lock) {
            synchronized (this) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                doSomething();
            }
        }
    }

    private void doSomething() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        new Thread(solution::secondMethod).start();
        new Thread(solution::firstMethod).start();
    }
}