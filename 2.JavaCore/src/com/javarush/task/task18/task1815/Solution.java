package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {

        private ATableInterface example;

        public TableInterfaceWrapper(ATableInterface example) {
            this.example = example;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            example.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return example.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            example.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}