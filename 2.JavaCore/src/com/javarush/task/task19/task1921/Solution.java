package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

        while (reader.ready()) {
            String[] data = reader.readLine().split(" ");
            StringBuilder birth = new StringBuilder();
            StringBuilder name = new StringBuilder();

            for (String x : data) {
                if (x.matches("\\d+")) birth.append(x + " ");
                else name.append(x + " ");
            }

            birth.deleteCharAt(birth.length()-1);
            name.deleteCharAt(name.length()-1);

            PEOPLE.add(new Person(name.toString(), dateFormat.parse(birth.toString())));
        }

        reader.close();
    }
}
