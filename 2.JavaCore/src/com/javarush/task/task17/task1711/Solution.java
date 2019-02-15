package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        int id;

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length-1; i += 3) {
                        if (args[i+2].equals("м")) allPeople.add(Person.createMale(args[i+1], dateFormat.parse(args[i+3])));
                        if (args[i+2].equals("ж")) allPeople.add(Person.createFemale(args[i+1], dateFormat.parse(args[i+3])));
                        System.out.println(allPeople.size()-1);
                    }
                }
                break;

            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length-1; i += 4) {
                        id = Integer.parseInt(args[i+1]);
                        Person person = allPeople.get(id);
                        person.setName(args[i+2]);
                        if (args[i+3].equals("м")) person.setSex(Sex.MALE);
                        if (args[i+3].equals("ж")) person.setSex(Sex.FEMALE);
                        person.setBirthDay(dateFormat.parse(args[i+4]));
                        allPeople.set(id, person);
                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length-1; i++) {
                        id = Integer.parseInt(args[i+1]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDay(null);
                    }
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length-1; i++) {
                        id = Integer.parseInt(args[i+1]);
                        System.out.println(allPeople.get(id));
                    }
                }
                break;
        }

//        for (Person x : allPeople) System.out.println(x.toString());
    }
}
