package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(result);
    }
    
    static {
        try {
            reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();

        if (data.equals("helicopter")) result = new Helicopter();
        if (data.equals("plane")) result = new Plane(Integer.parseInt(reader.readLine()));

        reader.close();
    }
}
