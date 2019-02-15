package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> threeList = new ArrayList<>();
        ArrayList<Integer> twoList = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 20; i++) {
            if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 == 0) {
                threeList.add(mainList.get(i));
                twoList.add(mainList.get(i));
            }
            else if (mainList.get(i) % 3 == 0) threeList.add(mainList.get(i));
            else if (mainList.get(i) % 2 == 0) twoList.add(mainList.get(i));
            else otherList.add(mainList.get(i));
        }

        printList(threeList);
        printList(twoList);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
