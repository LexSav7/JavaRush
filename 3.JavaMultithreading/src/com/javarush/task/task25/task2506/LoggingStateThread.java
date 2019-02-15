package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread thread = null;

    public LoggingStateThread(Thread thread) {
        setDaemon(true);
        this.thread = thread;
    }

    @Override
    public void run() {
        Thread.State previous = thread.getState();
        System.out.println(thread.getState());

        while (!thread.isInterrupted()) {
            Thread.State current = thread.getState();
            if(current != previous) {
                System.out.println(current);
                if (current == State.TERMINATED) break;
                previous = current;
            }
        }
        interrupt();
    }
}
