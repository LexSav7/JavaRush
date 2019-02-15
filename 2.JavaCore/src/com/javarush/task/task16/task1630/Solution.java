package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) { }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        FileReader fileReader;
        StringBuilder builder = new StringBuilder();

        @Override
        public void setFileName(String fullFileName) {
            try {
                fileReader = new FileReader(fullFileName);
            } catch (FileNotFoundException e) { }
        }

        @Override
        public String getFileContent() {
            return builder.toString();
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(fileReader);

            try {
                String data = reader.readLine();
                while (data != null) {
                    builder.append(data);
                    builder.append(" ");
                    data = reader.readLine();
                }
            } catch (IOException e) { }

            try {
                fileReader.close();
                reader.close();
            } catch (IOException e) { }
        }
    }
}
