package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Person {
    private String name;
    private Sex sex;
    private Date birthDay;
    SimpleDateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    private Person(String name, Sex sex, Date birthDay) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public static Person createMale(String name, Date birthDay) {
        return new Person(name, Sex.MALE, birthDay);
    }

    public static Person createFemale(String name, Date birthDay) {
        return new Person(name, Sex.FEMALE, birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() { return sex; }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String date = null;
        if (getBirthDay()!=null) date = newFormat.format(getBirthDay());
        String sex = null;
        if (getSex()==Sex.MALE) sex = "м";
        if (getSex()==Sex.FEMALE) sex = "ж";
        builder.append(getName()+" ").append(sex +" ").append(date);
        return builder.toString();
    }
}
