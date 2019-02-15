package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
        threads.get(3).start();
        Thread.sleep(500);
        System.out.println(threads.get(3).isInterrupted());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) { }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            if (isInterrupted()) System.out.println("InterruptedException");
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) { }
        }
    }

    public static class Thread4 extends Thread implements Message {

        @Override
        public void run() {
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            if (isAlive()) {
                interrupt();
            }
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<>();

            try {
                String s = reader.readLine();
                while (!s.equals("N")) {
                    list.add(Integer.parseInt(s));
                    s = reader.readLine();
                }
            } catch (IOException e) { }

            int sum = 0;
            for (Integer x : list) { sum += x; }
            System.out.println(sum);
        }
    }
}