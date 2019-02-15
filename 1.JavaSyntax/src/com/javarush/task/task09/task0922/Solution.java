package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date oldDate = new Date(reader.readLine());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(newDateFormat.format(oldDate).toUpperCase());


//        String oldDate = reader.readLine();
//        SimpleDateFormat oldDateFormat = new SimpleDateFormat("mm/DD/yyyy");
//        SimpleDateFormat newDateFormat = new SimpleDateFormat("mm DD, yyyy");
//        Date newDate = oldDateFormat.parse(oldDate);
//        String result = newDateFormat.format(newDate);


//        String oldDateString = "2015-05-15";
//        SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
//        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
//
//        Date date = oldDateFormat.parse(oldDateString);
//        String result = newDateFormat.format(date);
    }
}
