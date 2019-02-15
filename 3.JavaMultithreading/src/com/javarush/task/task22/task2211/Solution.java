package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream(args[0]);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(args[1]), "UTF-8"));
//        FileOutputStream fos = new FileOutputStream(args[1]);
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8"));

//        StringBuilder builder = new StringBuilder();
        while (reader1.ready()) System.out.println(reader1.readLine());
        reader1.close();
        while (reader2.ready()) System.out.println(reader2.readLine());
        reader2.close();
//      System.out.println("incorrect: " + builder.toString());

    }
}
