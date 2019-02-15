package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable, Runnable{
    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public Solution() {
        runner.start();
    }

    public void run() {
        System.out.println("I am running!");
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        new Thread(this).start();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution sol1 = new Solution(7);
        File file = File.createTempFile("test", null);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(sol1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Solution sol2 = (Solution) ois.readObject();
        ois.close();
    }
}
