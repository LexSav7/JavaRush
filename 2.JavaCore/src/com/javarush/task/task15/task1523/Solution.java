package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    public String name;
    public int age;
    public boolean sex;

    public Solution(boolean sex) { this.sex = sex; }

    private Solution(int age) { this.age = age; }

    Solution() {}

    protected Solution(String name) { this.name = name; }

}

