package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());


        while (inputStream.available() > 0) {
            byte[] buffer1;
            if (!(inputStream.available()%2==0)) buffer1 = new byte[(inputStream.available()/2)+1];
            else buffer1 = new byte[inputStream.available()/2];

            int count1 = inputStream.read(buffer1);
            byte[] buffer2 = new byte[inputStream.available()];
            int count2 = inputStream.read(buffer2);

            outputStream1.write(buffer1, 0, count1);
            outputStream2.write(buffer2, 0, count2);
        }

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
