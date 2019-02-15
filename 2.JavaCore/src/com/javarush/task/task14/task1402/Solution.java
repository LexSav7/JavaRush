package com.javarush.task.task14.task1402;

/*
Bingo-2!
*/

public class Solution {
    public static void main(String[] args)
    {
        Pet pet = new Tiger();
        System.out.println(doAllAction(pet));

        Pet pet2 = new Cat();
        System.out.println(doAllAction(pet2));

        Pet pet3 = new Pet();
        System.out.println(doAllAction(pet3));
    }

    public static String doAllAction(Pet pet)
    {
        if (pet instanceof Tiger) {
            Tiger tiger = (Tiger) pet;
            return "Tiger";
        }

        if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
            return "Cat";
        }

        return "Pet";
    }

    public static class Pet {

    }

    public static class Cat extends Pet {

    }

    public static class Tiger extends Cat{

    }
}
