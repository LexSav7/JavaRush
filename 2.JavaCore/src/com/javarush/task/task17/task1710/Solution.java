package com.javarush.task.task17.task1710;

import sun.util.calendar.BaseCalendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        if (args.length > 1) {
            SimpleDateFormat oldFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date;
            int id = 0;
            try { id = Integer.parseInt(args[1]); } catch (NumberFormatException e) { }

            switch (args[0]) {
                case "-c":
                    date = oldFormat.parse(args[3]);
                    if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], date));
                    if (args[2].equals("ж")) allPeople.add(Person.createFemale(args[1], date));
                    System.out.println(allPeople.size() - 1);
                    break;

                case "-u":
                    allPeople.get(id).setName(args[2]);
                    if (args[3].equals("м")) allPeople.get(id).setSex(Sex.MALE);
                    if (args[3].equals("ж")) allPeople.get(id).setSex(Sex.FEMALE);
                    date = oldFormat.parse(args[4]);
                    allPeople.get(id).setBirthDay(date);
                    break;

                case "-d":
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDay(null);
                    break;

                case "-i":
                    System.out.println(allPeople.get(id));
                    break;
            }
        }
    }
}
