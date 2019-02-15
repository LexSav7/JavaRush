package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties prop = new Properties();
    
    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(file);
        load(inputStream);
        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file);
        save(outputStream);
        outputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        for (Map.Entry<String, String> pair : properties.entrySet()) {
            prop.setProperty(pair.getKey(), pair.getValue());
        }
        prop.store(outputStream, "saving");
    }

    public void load(InputStream inputStream) throws Exception {
        prop.load(inputStream);
        for (Map.Entry<Object, Object> pair : prop.entrySet()) {
            properties.put((String) pair.getKey(), (String) pair.getValue());
        }
    }

    public static void main(String[] args) throws Exception {
        new Solution().fillInPropertiesMap();
    }
}
