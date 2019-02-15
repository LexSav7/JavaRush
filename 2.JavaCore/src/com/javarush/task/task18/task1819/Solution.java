package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream inputStream1 = new FileInputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);

        byte[] buffer1 = new byte[inputStream1.available()];
        byte[] buffer2 = new byte[inputStream2.available()];

        int count1 = inputStream1.read(buffer1);
        inputStream1.close();
        int count2 = inputStream2.read(buffer2);
        inputStream2.close();

        FileOutputStream outputStream2 = new FileOutputStream(file1);
        outputStream2.write(buffer2, 0, count2);
        outputStream2.close();
        FileOutputStream outputStream1 = new FileOutputStream(file1, true);
        outputStream1.write(buffer1, 0, count1);
        outputStream1.close();
    }
}
