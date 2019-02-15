package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    public static volatile AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
//        while (count.get() < 3) {}
//        t1.interrupt();
        t2.start();
        t2.join();
//        while (count.get() < 6) {}
//        t2.interrupt();
        t1.printResult();
        t2.printResult();

        reader.close();
    }

    public static class Read3Strings extends Thread {
        List<String> list = new ArrayList<>();

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
//                    if (reader.ready()) {
                        list.add(reader.readLine());
//                        count.incrementAndGet();
//                        System.out.println(count);
//                    }
                } catch (IOException e) {}
            }
        }

        public void printResult() {
            for (String x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
