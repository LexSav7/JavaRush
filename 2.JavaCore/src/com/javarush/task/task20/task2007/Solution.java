package com.javarush.task.task20.task2007;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Как сериализовать JavaRush?
*/
public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JavaRush javaRush = new JavaRush();
        File file = File.createTempFile("test", null);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(javaRush);
        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        JavaRush newJavaRush = (JavaRush) ois.readObject();
        fis.close();
        ois.close();
    }
}
