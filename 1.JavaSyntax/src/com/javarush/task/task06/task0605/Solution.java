package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double indexBody = weight / (height*height);

            if (indexBody < 18.5) System.out.println("Недовес: меньше чем 18.5");
            else if (indexBody >= 18.5 && indexBody < 25) System.out.println("Нормальный: между 18.5 и 24.9");
            else if (indexBody >= 25 && indexBody < 30) System.out.println("Избыточный вес: между 25 и 29.9");
            else if (indexBody >= 30) System.out.println("Ожирение: 30 или больше");
        }
    }
}


//"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
//        "Нормальный: между 18.5 и 24.9" - если индекс массы тела между 18.5 и 24.9,
//        "Избыточный вес: между 25 и 29.9" - если индекс массы тела между 25 и 29.9,
//        "Ожирение: 30 или больше" - если индекс массы тела 30 или больше.
