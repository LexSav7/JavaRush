package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int x = 10;
        int y = 10;

        while (y > 0) {
            while (x > 0) {
                System.out.print('S');
                x--;
                if (x == 0) {
                    System.out.print("\n");
                    x = 10;
                    break;
                }
            }
            y--;
        }

    }
}
