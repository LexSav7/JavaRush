package com.javarush.task.task27.task2709;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public int get() {
        while (!isValuePresent) {
            try {
                synchronized (this) {
                    this.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Got: " + value);
        isValuePresent = false;
        synchronized (this) {
            this.notifyAll();
        }
        return value;
    }

    public void put(int value) {
        while (isValuePresent) {
            try {
                synchronized (this) {
                    this.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.value = value;
        isValuePresent = true;
        synchronized (this) {
            this.notifyAll();
        }
        System.out.println("Put: " + value);
    }
}
