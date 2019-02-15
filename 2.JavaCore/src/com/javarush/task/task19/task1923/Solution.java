package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

        while (fileReader.ready()) {
            String[] data = fileReader.readLine().split(" ");
            for (String x : data) {
//                for (int i = 0; i < x.length(); i++) {
//                    if (Character.isDigit(x.charAt(i))) {
//                        fileWriter.write(x + " ");
//                        break;
//                    }
//                }
                if (x.matches(".*\\d+.*")) fileWriter.write(x + " ");
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
