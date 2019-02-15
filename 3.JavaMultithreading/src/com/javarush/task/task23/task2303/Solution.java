package com.javarush.task.task23.task2303;

/* 
Запрети создание экземпляров класса
*/
public final class Solution {
    public static final class Listener {
        public Listener() {
            throw new RuntimeException("Creation of the object is not allowed!");
        }
        public void onMouseDown(int x, int y) {
            System.out.println(x + " " + y);
        }
        public void onMouseUp(int x, int y) {
            //do something on mouse up event
        }
    }

    public static void main(String[] args) {
        new Listener();
    }
}
