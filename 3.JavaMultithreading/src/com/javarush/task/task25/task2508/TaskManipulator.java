package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    Thread thread;

    @Override
    public void run() {
        while (thread.isAlive()) {
//            if (thread.isInterrupted()) break;
            System.out.println(thread.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void start(String threadName) {
        thread = new Thread(threadName);
        thread.start();
        run();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
