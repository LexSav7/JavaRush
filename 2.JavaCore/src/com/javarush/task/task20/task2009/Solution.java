package com.javarush.task.task20.task2009;

import java.io.*;

/*
Как сериализовать static?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "it's test static string";
        public int i;
        public int j;

        public static void serializeStatic(ObjectOutputStream oos) throws IOException {
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(oos));
//            writer.write(staticString);
            oos.writeObject("something");
        }

        public static Object deserializeStatic(ObjectInputStream ois) throws IOException, ClassNotFoundException {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(ois));
//            staticString = reader.readLine();
            return ois.readObject();
        }

        @Override
        public String toString() {
            return staticString + " " + i + " " + j;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassWithStatic classWithStatic = new ClassWithStatic();
        File file = File.createTempFile("test", null);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(classWithStatic);
        ClassWithStatic.serializeStatic(oos);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ClassWithStatic cws = (ClassWithStatic) ois.readObject();
        ClassWithStatic.staticString = (String) ClassWithStatic.deserializeStatic(ois);
        ois.close();

        System.out.println(classWithStatic);
        System.out.println(cws);
    }
}
