package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            String text = fileReader.readLine();
            while (text != null) {
                if (i == 0) allLines.add(text);
                if (i == 1) forRemoveLines.add(text);
                text = fileReader.readLine();
            }
            fileReader.close();
        }
        reader.close();

        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }


        for (int i = 0; i < forRemoveLines.size(); i++) {
            for (int j = 0; j < allLines.size(); j++) {
                if (forRemoveLines.get(i).equals(allLines.get(j))) {
                    list.add(forRemoveLines.get(i));
                    if (i != forRemoveLines.size() - 1) i++;
                }
            }
        }

        if (list.size() < forRemoveLines.size()) {
            allLines.clear();
            throw new CorruptedDataException();
        } else {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < allLines.size(); j++) {
                    if (list.get(i).equals(allLines.get(j))) allLines.remove(j);
                }
            }
        }
    }
}
