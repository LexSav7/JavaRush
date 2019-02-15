package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("testing", ".txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            User alex = new User();
            alex.setBirthDate(dateFormat.parse("1996-08-24T11:54:37.255"));
            alex.setCountry(User.Country.UKRAINE);
            alex.setFirstName("Alex");
            alex.setLastName("Savenko");
            alex.setMale(true);
            javaRush.users.add(alex);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            System.out.println(loadedObject.equals(javaRush));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

            StringBuilder user;
            if (!users.isEmpty()) {
                for (User x : users) {
                    user = new StringBuilder();
                    user.append(x.getFirstName() + " ").append(x.getLastName() + " ")
                        .append(x.isMale() + " ").append(dateFormat.format(x.getBirthDate()) + " ").append(x.getCountry());
                    writer.write(user.toString() + System.lineSeparator());
                }
            }

            writer.flush();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            while (reader.ready()) {
                String[] data = reader.readLine().split(" ");
                User newUser = new User();

                newUser.setFirstName(data[0]);
                newUser.setLastName(data[1]);
                newUser.setMale(data[2].equals("true"));
                newUser.setBirthDate(dateFormat.parse(data[3]));
                for (User.Country x : User.Country.values())
                    if (data[4].equals(x.name())) newUser.setCountry(x);
                users.add(newUser);
            }

            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
