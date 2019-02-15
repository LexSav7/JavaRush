package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();
        while (br.ready()) builder.append(br.readLine() + " ");
        br.close();

        ArrayList<String> list = new ArrayList<>();
        String[] parts = builder.toString().trim().split(" ");
        for (String x : parts) list.add(x);


        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1) break;
            String reverse = new StringBuilder(list.get(i)).reverse().toString();
            for (int j = i+1; j < list.size(); j++) {
                if (reverse.equals(list.get(j))) {
                    result.add(new Pair(list.get(i), list.get(j)));
                    list.remove(j);
                    list.remove(i);
                    j--; i--;
                    break;
                }
            }
        }

        for (Pair x : result) System.out.println(x);
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {}

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
