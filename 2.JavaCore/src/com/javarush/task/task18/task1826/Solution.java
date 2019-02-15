package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        byte[] buffer = new byte[inputStream.available()];
        int count = 0;

        switch (args[0]) {
            case "-e":
                while (inputStream.available() > 0) count = inputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) buffer[i] += 1;
                outputStream.write(buffer, 0, count);
                break;

            case "-d":
                while (inputStream.available() > 0) count = inputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) buffer[i] -= 1;
                outputStream.write(buffer, 0, count);
                break;
        }

        inputStream.close();
        outputStream.close();

//        ArrayList<String> list = new ArrayList<>();
//        while (fileReader.ready()) list.add(fileReader.readLine());
//        fileReader.close();
//        inputStream.close();
//
//        FileOutputStream outputStream = new FileOutputStream(args[2]);
//
//        switch (args[0]) {
//            case "-e":
//                for (String x : list) {
//                    byte[] bytes = x.getBytes();
//                    for (Byte y : bytes) outputStream.write(y + 1);
//                }
//                break;
//            case "-d":
//                for (String x : list) {
//                    byte[] bytes = x.getBytes();
//                    for (Byte y : bytes) outputStream.write(y - 1);
//                }
//                break;
//        }
//
//        outputStream.close();

    }

}
