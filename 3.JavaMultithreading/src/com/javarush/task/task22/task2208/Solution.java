package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static Map<String, String> map = new LinkedHashMap();

    public static void main(String[] args) {
        map.put("name", "Alex");
        map.put("country", "Ukraine");
        map.put("city", "Odessa");
        map.put("age", null);

        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        if (params != null) {
            StringBuilder result = new StringBuilder();
            for (Map.Entry<String, String> pair : params.entrySet()) {
                if (pair.getValue() != null) {
                    result.append(String.format("%s = '%s' and ", pair.getKey(), pair.getValue()));
                }
            }

            if (result.length() != 0)
                result.delete(result.length()-5, result.length());

            return result.toString();
        }
        return null;
    }
}
