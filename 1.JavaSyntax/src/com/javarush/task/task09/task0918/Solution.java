package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends IndexOutOfBoundsException {
        MyException e = new MyException();
    }

    static class MyException2 extends ArithmeticException {
        MyException2 e = new MyException2();
    }

    static class MyException3 extends FileNotFoundException {
        MyException3 e = new MyException3();
    }

    static class MyException4 extends ClassNotFoundException {
        MyException4 e = new MyException4();

    }
}

