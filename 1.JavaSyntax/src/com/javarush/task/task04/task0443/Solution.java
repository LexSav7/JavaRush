package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String year = reader.readLine();
        int y = Integer.parseInt(year);

        String month = reader.readLine();
        int m = Integer.parseInt(month);

        String day = reader.readLine();
        int d = Integer.parseInt(day);

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
