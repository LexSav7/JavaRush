package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (bufferedReader1.ready() && bufferedReader2.ready()) {
            String line1 = bufferedReader1.readLine();
            String line2 = bufferedReader2.readLine();

            if (line1.equals(line2)) lines.add(new LineItem(Type.SAME, line1));
            if (line1.isEmpty() && !line2.isEmpty()) lines.add(new LineItem(Type.ADDED, line2));
            if (line2.isEmpty() && !line1.isEmpty()) lines.add(new LineItem(Type.REMOVED, line1));
        }

        bufferedReader1.close();
        bufferedReader2.close();

        for (LineItem x : lines) System.out.println(x.type + " " + x.line);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
