package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args != null) {

            String file = null;
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                file = reader.readLine();
            }

            StringBuilder builder = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.ready()) builder.append(reader.readLine());
            }

            String content = builder.toString().trim();
            Pattern pattern = Pattern.compile
                              ("<"+args[0]+">((<"+args[0]+">.*<"+args[0]+"/>)*|.*)<"+args[0]+"/>");

            String[] parts = builder.toString().split("");

        }
    }
}
