package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Составить цепочку слов
*/
public class Solution {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();
        while (br.ready()) builder.append(br.readLine() + " ");
        br.close();
        String[] words = builder.toString().split(" ");

        Arrays.sort(words);
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static void removal(int i, int j) {
        if (i > j) {
            list.remove(i);
            list.remove(j);
        } else {
            list.remove(j);
            list.remove(i);
        }
    }

    public static StringBuilder getLine(String... words) {
        if (words != null) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < words.length; i++) list.add(words[i]);

            label: for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (i != j) {
                        if (Character.toLowerCase(list.get(j).charAt(0)) ==
                            Character.toLowerCase(list.get(i).charAt(list.get(i).length()-1))) {
                            result.append(list.get(i) + " " + list.get(j));
                            removal(i, j);
                            break label;
                        } else if (Character.toLowerCase(list.get(i).charAt(0)) ==
                            Character.toLowerCase(list.get(j).charAt(list.get(j).length()-1))) {
                            result.append(list.get(j) + " " + list.get(i));
                            removal(i, j);
                            break label;
                        }
                    }
                }
            }

            for (int j = 0; j < list.size(); j++) {
                if (Character.toLowerCase(list.get(j).charAt(0)) ==
                    Character.toLowerCase(result.charAt(result.length()-1))) {
                    result.append(" " + list.get(j));
                    list.remove(j);
                    j = -1;
                } else if (Character.toLowerCase(list.get(j).charAt(list.get(j).length()-1)) ==
                    Character.toLowerCase(result.charAt(0))) {
                    result.insert(0, list.get(j) + " ");
                    list.remove(j);
                    j = -1;
                }
            }

            if (list.size() != 0 ) {
                for (String x : list) result.append(" " + x);
            }
            return result;
        }
        return new StringBuilder();
    }
}
