package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    transient private static String fileName = "D:/java/testing.txt";


    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
//        out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
//        in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = File.createTempFile("test", null);
//        String fileName = "D:/java/testing.txt";
        Solution solution = new Solution(fileName);

        ObjectOutputStream oos = new ObjectOutputStream(solution.stream);
        oos.writeObject(solution);
        solution.writeObject("Hello World!");
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        Solution solution1 = (Solution) ois.readObject();
        ois.close();

        solution1.writeObject("Hello World! Again...");
    }
}
