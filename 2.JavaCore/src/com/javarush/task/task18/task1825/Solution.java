package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static String test = "test";

    public static void main(String[] args) throws IOException {

        List<String> files = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = null;
            while (!(fileName = reader.readLine()).equals("end"))
                files.add(fileName);
        }

        Collections.sort(files, new MyComparator());

        String commonFile = files.get(0).replaceAll("\\.part\\d+", "");
//        if (!Files.exists(Paths.get(commonFile)))
//            Files.createFile(Paths.get(commonFile));

        FileOutputStream output = new FileOutputStream(commonFile, true);
        for (String x : files) {
            FileInputStream input = new FileInputStream(x);
            byte[] buffer = new byte[input.available()];
            if (input.available() > 0) input.read(buffer);
            output.write(buffer);
            input.close();
        }
        output.close();

    }

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return Integer.parseInt(o1.replaceAll(".+\\.part", "").replaceAll("\\..+", "")) -
                   Integer.parseInt(o2.substring(o2.lastIndexOf(".part")+5, o2.lastIndexOf('.')));
        }
    }

}
