package com.javarush.task.task03.task0324;

/* 
Меркантильные намерения
*/

public class Solution {
    public static void main(String[] args) {
        print("Я хочу большую зарплату, и для этого изучаю Java", 10);
    }

    public static void print(String text, int count){
        for(int i=0; i<count; i++){
            System.out.println(text);
        }
    }
}
