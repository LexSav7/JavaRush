package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            cats.add(new Cat());
        }

        return cats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
//        Set<Object> copy = new HashSet<>(pets);

        pets.removeAll(cats);

//        for (Object x : copy) {
//            if (x.getClass().equals(cats)) pets.remove(x);
//        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object x : pets) {
            System.out.println(x);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
