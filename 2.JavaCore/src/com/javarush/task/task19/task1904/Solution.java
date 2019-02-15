package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private final Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] data = fileScanner.nextLine().split(" ");
            String stringDate = data[3] + " " + data[4] + " " + data[5];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = null;
            try { birthDate = dateFormat.parse(stringDate); } catch (ParseException e) { }
            return new Person(data[1], data[2], data[0], birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
