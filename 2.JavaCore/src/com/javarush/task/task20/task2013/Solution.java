package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {}

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(firstName, person.firstName) &&
                    Objects.equals(lastName, person.lastName) &&
                    Objects.equals(mother, person.mother) &&
                    Objects.equals(father, person.father) &&
                    Objects.equals(children, person.children);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, age, mother, father, children);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person me = new Person("Alex", "Savenko", 21);
        me.setMother(new Person("Elena", "Savenko", 45));
        me.setFather(new Person("Anatoliy", "Zhivolup", 55));

        List<Person> children = new ArrayList<>();
        children.add(new Person("Dima", "Savenko", 3));
        children.add(new Person("Alice", "Savenko", 2));
        children.add(new Person("Artem", "Savenko", 1));
        me.setChildren(children);

        File file = File.createTempFile("test", null);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(me);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Person anotherMe = (Person) ois.readObject();
        ois.close();

        System.out.println(me.equals(anotherMe));
    }
}
