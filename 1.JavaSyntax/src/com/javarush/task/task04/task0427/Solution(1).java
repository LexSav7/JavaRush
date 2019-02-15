package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int n = Integer.parseInt(s);
        int nL = s.length();

        if (n>0 && n<1000) {
            if ((n%2==0) && nL==1) System.out.println("четное однозначное число");
            else if (!(n%2==0) && nL==1) System.out.println("нечетное однозначное число");
            else if ((n%2==0) && nL==2) System.out.println("четное двузначное число");
            else if (!(n%2==0) && nL==2) System.out.println("нечетное двузначное число");
            else if ((n%2==0) && nL==3) System.out.println("четное трехзначное число");
            else if (!(n%2==0) && nL==3) System.out.println("нечетное трехзначное число");
        }

//    Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
//    «четное однозначное число» - если число четное и имеет одну цифру,
//    «нечетное однозначное число» - если число нечетное и имеет одну цифру,
//    «четное двузначное число» - если число четное и имеет две цифры,
//    «нечетное двузначное число» - если число нечетное и имеет две цифры,
//    «четное трехзначное число» - если число четное и имеет три цифры,
//    «нечетное трехзначное число» - если число нечетное и имеет три цифры.

    }
}
